package com.vogella.mockito.inject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ArticleManagerTest {

    @Mock
    ArticleDatabase database;

    @Mock
    User user;

    @InjectMocks
    private ArticleManager manager;

    @Test
    void ensureInjectMockWorks() {
        // calls addListener with an instance of ArticleListener
        manager.initialize();
        // TODO verify that addListener was called with any (instance) of ArticleListener.class
        verify(database).addListener(any(ArticleListener.class));
        verify(database).setUser(user);
    }
}