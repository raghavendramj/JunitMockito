package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class MyUtilsTest {

    @Test
    void shouldMockStaticMethod() {
        MockedStatic<FinalClass> mockFinal = Mockito.mockStatic(FinalClass.class);

        try (MockedStatic<Utility> mockedStatic = Mockito.mockStatic(Utility.class)) {
            mockedStatic.when(() -> Utility.getDatabaseConnection(Mockito.eq("test"))).thenReturn("testing");
            mockedStatic.when(() -> Utility.getDatabaseConnection(Mockito.eq("prod"))).thenReturn("production");

            String result1 = Utility.getDatabaseConnection("test");
            assertEquals("testing", result1);

            String result2 = Utility.getDatabaseConnection("prod");
            assertEquals("production", result2);
        }
    }
}