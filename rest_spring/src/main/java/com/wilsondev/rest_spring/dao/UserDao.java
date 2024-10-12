package com.wilsondev.rest_spring.dao;

import com.wilsondev.rest_spring.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface UserDao {

    List<User> obtenerUsers();
    User obtenerUser(long id);
    User registerUser( User user );
    User updateUser( User user );
    void deleteUser( long id );

}
