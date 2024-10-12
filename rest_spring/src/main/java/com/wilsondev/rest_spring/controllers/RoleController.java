package com.wilsondev.rest_spring.controllers;

import com.wilsondev.rest_spring.models.Role;
import com.wilsondev.rest_spring.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Role> obtenerRoles(){

        var users = roleService.obtenerRoles();

        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Role obtenerRole(@PathVariable long id){

        var user = roleService.obtenerRole(id);
        return user;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    Role registerRole(@RequestBody() Role request ){

        var user = roleService.registerRole(request);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Role updateRole(@RequestBody() Role request ){

        var user = roleService.updateRole(request);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteRole(@PathVariable long id ){
        roleService.deleteRole(id);
    }
}
