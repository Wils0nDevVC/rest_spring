package com.wilsondev.rest_spring.dao.imp;

import com.wilsondev.rest_spring.dao.RoleDao;
import com.wilsondev.rest_spring.models.Role;

import java.util.List;


public class RoleDaoImp implements RoleDao {
    @Override
    public List<Role> obtenerRoles() {
        return List.of();
    }

    @Override
    public Role obtenerRole(long id) {
        return null;
    }

    @Override
    public Role registerRole(Role role) {
        return null;
    }

    @Override
    public Role updateRole(Role role) {
        return null;
    }

    @Override
    public void deleteRole(long id) {

    }
}
