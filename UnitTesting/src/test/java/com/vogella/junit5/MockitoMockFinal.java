package com.vogella.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class MockitoMockFinal {


    @Mock
    FinalClass finalMocked;


    @Test
    public void testMockFinal() {
        assertNotNull(finalMocked);
    }

    @Test
    public void testMockFinalViaMockStatic() {
        MockedStatic<FinalClass> mockStatic = Mockito.mockStatic(FinalClass.class);
        assertNotNull(mockStatic);
    }
}