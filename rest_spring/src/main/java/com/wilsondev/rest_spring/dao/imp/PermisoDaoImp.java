package com.wilsondev.rest_spring.dao.imp;


import com.wilsondev.rest_spring.dao.PermisoDao;
import com.wilsondev.rest_spring.models.Permiso;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class PermisoDaoImp implements PermisoDao {
    @Override
    public List<Permiso> obtenerPermisos() {
        return List.of();
    }

    @Override
    public Permiso obtenerPermiso(long id) {
        return null;
    }

    @Override
    public Permiso registerPermiso(Permiso permiso) {
        return null;
    }

    @Override
    public Permiso updatePermiso(Permiso permiso) {
        return null;
    }

    @Override
    public void deletePermiso(long id) {

    }
}
