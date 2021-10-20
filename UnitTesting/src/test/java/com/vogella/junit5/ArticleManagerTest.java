package com.vogella.junit5;

import com.vogella.mockito.inject.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ArticleManagerTest {

    @Mock
    ArticleDatabase database;

    @Mock
    User user;

    @InjectMocks //-> Injects above two mocks
    private ArticleManager manager;

    @Test
    void shouldDoSomething() {
        // TODO perform some tests with this managers
    }
}