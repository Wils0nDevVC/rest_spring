package com.wilsondev.rest_spring.dao;

import com.wilsondev.rest_spring.models.Permiso;

import java.util.List;

public interface PermisoDao {

    List<Permiso> obtenerPermisos();
    Permiso obtenerPermiso(long id);
    Permiso registerPermiso( Permiso permiso );
    Permiso updatePermiso( Permiso permiso );
    void deletePermiso( long id );
}
