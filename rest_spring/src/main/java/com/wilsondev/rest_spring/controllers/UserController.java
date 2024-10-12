package com.wilsondev.rest_spring.controllers;

import com.wilsondev.rest_spring.models.User;
import com.wilsondev.rest_spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// notaciones : a partir de Java8 las anotaciones "@" le agrega mas información a la clase para que le diga como se debe comportar el recurso
//@RestController : notacion que le dice que es un Servicio Rest
@RestController
@RequestMapping("user") //notacion que sirve para darle una ruta al servicio

public class UserController{

    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> obtenerUsers(){

        var users = userService.obtenerUsers();

        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User obtenerUser(@PathVariable long id){

        var user = userService.obtenerUser(id);
        return user;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    User registerUser(@RequestBody() User request ){

       var user = userService.registerUser(request);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User updateUser(@RequestBody() User request ){

        var user = userService.updateUser(request);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteUser(@PathVariable long id ){
         userService.deleteUser(id);
    }

}
