package com.picsart.clients;

import java.util.List;

import com.picsart.models.User;

public class UsersClient extends BaseApi {
    public UsersClient() {
        super("users");
    }

    public List<User> getUsers() {
        return requestSpecification.get().jsonPath().getList("", User.class);
    }

    public User getUser(int id) {
        return requestSpecification.get(String.valueOf(id)).as(User.class);
    }
}
