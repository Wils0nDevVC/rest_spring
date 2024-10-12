package com.wilsondev.rest_spring.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"})
})
@ToString //Lombok genera automanticamente el metodo toString
@EqualsAndHashCode //Genera automanticamente métodos equals() y hashCode()
public class User extends  BaseEntity {



    //De esta forma le decimos que muchos usuarios pueden tener un rol
    @JsonProperty(access = JsonProperty.Access.READ_ONLY) //READ_ONLY : no permite modificar el rol desde usuario
    @ManyToOne(fetch = FetchType.EAGER) //EAGER : Con esto siempre traemos todo el contenido de rol
    @JoinColumn(name = "role_id")
    @Getter @Setter
    private Role role;

//    @Id()
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", updatable = false, nullable = false)
//    private  long id;

    //Esto es de la librería Loombok, que nos simplifca los getters y setters
    @Getter @Setter
    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Getter @Setter
    @Column(name = "primer_apellido",nullable = false)
    private String primer_apellido;
    @Getter @Setter
    @Column(name = "segundo_apellido",nullable = false)
    private String segundo_apellido;
    @Getter @Setter
    @Column(name = "email",nullable = false)
    private String email;
    @JsonIgnore()
    @Getter @Setter
    @Column(name = "password",nullable = false)
    private String password;
    @Getter @Setter
    @Column(name = "telefono")
    private String telefono;
    @Getter @Setter
    @Column(name = "fechaNac",nullable = false)
    private Date fechaNac;




    public User(){}

    public User(long id, String nombre, String primer_apellido, String segundo_apellido, String email, String password, String telefono, Date fechaNac) {
        setId(id);
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }

}
