package com.mindandmatters.william.maps_test;

import android.app.Application;

import com.mindandmatters.william.maps_test.models.User;


public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
