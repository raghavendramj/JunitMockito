package com.vogella.junit5;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;


public class AnswerTest {

    @Mock
    List<String> list;

    @Test
    public final void answerTest() {
        // with doAnswer():
        doAnswer(returnsFirstArg()).when(list).add(anyString());
        // with thenAnswer():
        when(list.add(anyString())).thenAnswer(returnsFirstArg());
        // with then() alias:
        when(list.add(anyString())).then(returnsFirstArg());
    }

//    @Test
//    public final void callbackTest() {
//        ApiService service = mock(ApiService.class);
//        when(service.login(any(Callback.class))).thenAnswer(i -> {
//            Callback callback = i.getArgument(0);
//            callback.notify("Success");
//            return null;
//        });
//    }
}
