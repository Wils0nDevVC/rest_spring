package com.wilsondev.rest_spring.services;

import com.wilsondev.rest_spring.dao.PermisoDao;
import com.wilsondev.rest_spring.models.Permiso;
import com.wilsondev.rest_spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PermisoService {
    @Autowired
    PermisoDao permisoDao;

    public List<Permiso> obtenerPermisos(){
        return permisoDao.obtenerPermisos();
    }

    public Permiso obtenerPermiso( long id){
        return permisoDao.obtenerPermiso(id);
    }

    public Permiso registerPermiso( Permiso user ){
        return permisoDao.registerPermiso(user);
    }

    public Permiso updatePermiso( Permiso user ){
        return permisoDao.updatePermiso(user);
    }

    public void  deletePermiso( long id ){
        permisoDao.deletePermiso(id);
    }
}
