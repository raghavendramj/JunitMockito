package com.vogella.junit5;

import com.vogella.mockito.inject.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoPersitanceTest {

    @Test
    void testDao() {

        List<User> userMap = new ArrayList<>();
        UserDao dao = mock(UserDao.class);
        when(dao.save(any(User.class))).thenAnswer(i -> {
            User user = i.getArgument(0);
            userMap.add(user.getId(), user);
            return null;
        });
        when(dao.find(any(Integer.class))).thenAnswer(i -> {
            int id = i.getArgument(0);
            return userMap.get(id);
        });

        //TODO TestCase need to be written!
    }
}
