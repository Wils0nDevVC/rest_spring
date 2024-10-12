package com.wilsondev.rest_spring.dao;

import com.wilsondev.rest_spring.models.Role;

import java.util.List;

public interface RoleDao {

    List<Role> obtenerRoles();
    Role obtenerRole(long id);
    Role registerRole( Role role );
    Role updateRole( Role role );
    void deleteRole( long id );
}
