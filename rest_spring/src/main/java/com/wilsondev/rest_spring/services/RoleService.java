package com.wilsondev.rest_spring.services;

import com.wilsondev.rest_spring.dao.RoleDao;
import com.wilsondev.rest_spring.models.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleService {

    @Autowired
    RoleDao roleDao;

    public List<Role> obtenerRoles(){
        return roleDao.obtenerRoles();
    }

    public Role obtenerRole( long id){
        return roleDao.obtenerRole(id);
    }

    public Role registerRole( Role user ){
        return roleDao.registerRole(user);
    }

    public Role updateRole( Role user ){
        return roleDao.updateRole(user);
    }

    public void  deleteRole( long id ){
        roleDao.deleteRole(id);
    }
}
