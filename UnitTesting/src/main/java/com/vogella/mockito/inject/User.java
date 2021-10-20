package com.vogella.mockito.inject;

public class User {
    private int id;
    private String name;
    public User(){

    }

    public User(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
