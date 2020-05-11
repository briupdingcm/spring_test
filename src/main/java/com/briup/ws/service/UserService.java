package com.briup.ws.service;

import com.briup.ws.model.User;
import com.briup.ws.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
class UserService implements IUserService {
    private static long num = 100;
    private static Map<Long, User> users = new HashMap<>();
    @Override
    public User create(User user) {
        user.setId(num++);
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User update(User user) {
        users.put(user.getId(), user);
        return users.get(user.getId());
    }

    @Override
    public void remove(long id) {
        users.remove(id);
    }

    @Override
    public User findBy(long id) {
        return users.get(id);
    }

    @Override
    public Collection<User> findAll(){
        return users.values();
    }
}
