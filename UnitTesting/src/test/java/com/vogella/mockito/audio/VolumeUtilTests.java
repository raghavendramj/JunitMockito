package com.vogella.mockito.audio;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

class VolumeUtilTests {

    @Mock
    AudioManager audioManager;


    @Test
    void testNormalRingerIsMaximized() {
        // 1.) Ensure AudioManager gets mocked
        //Mocked Above

        // 2.) configure Audiomanager to return RINGER_MODE_NORMAL if getRinderMode is called
        when(audioManager.getRingerMode()).thenReturn(RINGER_MODE.RINGER_MODE_NORMAL);

        // 3.) configure Audiomanager to return 100 if getStreamMaxVolume() is called
        when(audioManager.getStreamMaxVolume()).thenReturn(100);

        // 4.) call VolumeUtil.maximizeVolume with Audiomanager -> code under test
        VolumeUtil.maximizeVolume(audioManager);

        // 5.) verify that setStreamVolume(100) was called on audioManager
        verify(audioManager, times(1)).getStreamMaxVolume();
    }

    @Test
    void testSilentRingerIsNotDisturbed() {
        // 1.) Ensure AudioManager gets mocked
        AudioManager audioManager = mock(AudioManager.class);

        // 2.) configure audiomanager to return "RINGER_MODE_SILENT" if getRingerMode is called
        when(audioManager.getRingerMode()).thenReturn(RINGER_MODE.RINGER_MODE_SILENT);

        // 3.) call VolumeUtil.maximizeVolume with audio manager
        VolumeUtil.maximizeVolume(audioManager);

        // 4.) verify that getRingerMode() is called on the mock
        verify(audioManager).getRingerMode();

        // 5.) Ensure that nothing more was called
        verifyNoInteractions(audioManager);


    }
}