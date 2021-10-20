package com.vogella.mockito.audio;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

class ConfigureThreadingUtilTests {
    @Test
    void ensureThatThreadPoolCanBeConfigured() {
        // mock MyApplication
        MyApplication application = mock(MyApplication.class);

        // call ConfigureThreadingUtil.configureThreadPool
        ConfigureThreadingUtil.configureThreadPool(application);


        // verify that getNumberOfThreads was the only one called on app
        verify(application, atMost(1)).getNumberOfThreads();

    }
}