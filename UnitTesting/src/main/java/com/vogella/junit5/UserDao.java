package com.vogella.junit5;

import com.vogella.mockito.inject.User;

public class UserDao {

    public User save(User user) {
        return new User();
    }

    public User find(int userId){
        return new User();
    }
}
