package com.nuclearfoxes.api;


import com.nuclearfoxes.models.User;
import com.nuclearfoxes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "{id}")
    public User get(@PathVariable("id") int id){
        return null;
    }

    @GetMapping()
    public Object get(){
        try {
            return userService.getAll();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
