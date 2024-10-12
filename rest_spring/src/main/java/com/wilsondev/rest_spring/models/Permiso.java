package com.wilsondev.rest_spring.models;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

@Entity
@Table(name = "permisos")
public class Permiso extends  BaseEntity {

    //Todas estas anotaciones es para que nos indique que solo nos traera el id
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("role_id") //nos indica como se llamara el campo en el JSON -> role_id : "1"
    @ManyToOne(fetch = FetchType.LAZY) //Lazy no nos trae todo el contenido de roles, solo el ID
    @JoinColumn(name = "role_id")
    private  Role role;

    @Column(name = "nombre")
    private  String  nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String roles) {
        this.nombre = roles;
    }
}
