package com.apache.gradle.gradle.controller;

public class User {
    int id;
    String username;
    String password;
    String email;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
