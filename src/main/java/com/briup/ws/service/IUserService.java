package com.briup.ws.service;

import com.briup.ws.model.User;

import java.util.Collection;

public interface IUserService {
    public User create(User user);
    public User update(User user);
    public void remove(long id);
    public User findBy(long id);
    public Collection<User> findAll();
}
