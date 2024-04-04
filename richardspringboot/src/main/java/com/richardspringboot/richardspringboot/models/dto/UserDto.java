package com.richardspringboot.richardspringboot.models.dto;

import com.richardspringboot.richardspringboot.models.User;

public class UserDto {

    private String title;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
