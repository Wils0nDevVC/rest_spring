package com.wilsondev.rest_spring.controllers;

import com.wilsondev.rest_spring.models.Permiso;
import com.wilsondev.rest_spring.services.PermisoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("permiso") //notacion que sirve para darle una ruta al servicio
public class PermisoController {

    @Autowired
    PermisoService permisoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Permiso> obtenerPermisos(){

        var users = permisoService.obtenerPermisos();

        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Permiso obtenerPermiso(@PathVariable long id){

        var user = permisoService.obtenerPermiso(id);
        return user;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    Permiso registerPermiso(@RequestBody() Permiso request ){

        var user = permisoService.registerPermiso(request);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Permiso updatePermiso(@RequestBody() Permiso request ){

        var user = permisoService.updatePermiso(request);
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deletePermiso(@PathVariable long id ){
        permisoService.deletePermiso(id);
    }
}
