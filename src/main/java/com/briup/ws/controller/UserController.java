package com.briup.ws.controller;

import com.briup.ws.model.User;
import com.briup.ws.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/user", produces = "application/json", consumes = "application/json")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public User find(@PathVariable(required = true) long id,
                     @RequestAttribute(required = true) String userName){
        return userService.findBy(id);
    }

    @RequestMapping(value="", method = RequestMethod.GET)
    public Collection<User> find(@RequestAttribute(required = true) String userName){
        return userService.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User create(@RequestBody User user,
                       @RequestAttribute(required = true) String userName){
        return userService.create(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable(required = true) long id,
                       @RequestAttribute(required = true) String userName){
        userService.remove(id);
    }

    @RequestMapping(value =  "", method = RequestMethod.PATCH)
    public User update(@RequestBody User user,
                       @RequestAttribute(required = true) String userName){
        return  userService.update(user);
    }
}
