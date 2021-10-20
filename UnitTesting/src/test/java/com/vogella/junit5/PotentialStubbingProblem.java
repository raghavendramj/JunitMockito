package com.vogella.junit5;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PotentialStubbingProblem {

    @Test
    public void withoutStrictStubsTest() throws Exception {
        DeepThought deepThought = mock(DeepThought.class);

        Mockito.when(deepThought.getAnswerFor("Ultimate Question of Life, The Universe, and Everything")).thenReturn(42);
        when(deepThought.otherMethod("some mundane thing")).thenReturn(null);

        System.out.println(deepThought.getAnswerFor("Six by nine"));

        assertEquals(42, deepThought.getAnswerFor("Ultimate Question of Life, The Universe, and Everything"));
        verify(deepThought, times(1)).getAnswerFor("Ultimate Question of Life, The Universe, and Everything");
    }
}
