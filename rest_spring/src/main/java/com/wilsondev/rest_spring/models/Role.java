package com.wilsondev.rest_spring.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "role")

public class Role extends  BaseEntity {


    // FetchType.EAGER : me trae todo el contenido del objeto
    // CascadeType.ALL : todos
    //mappedBy = "role" : mapea el rol del usuario
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "role" )
    private Set<Permiso> permisos;


    @Column(name = "nombre")
    private  String  nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String roles) {
        this.nombre = roles;
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }
}
