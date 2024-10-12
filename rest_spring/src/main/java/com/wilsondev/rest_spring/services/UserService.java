package com.wilsondev.rest_spring.services;

import com.wilsondev.rest_spring.dao.UserDao;
import com.wilsondev.rest_spring.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> obtenerUsers(){
        return userDao.obtenerUsers();
    }

    public User obtenerUser( long id){
        return userDao.obtenerUser(id);
    }

    public User registerUser( User user ){
        return userDao.registerUser(user);
    }

    public User updateUser( User user ){
        return userDao.updateUser(user);
    }

    public void  deleteUser( long id ){
         userDao.deleteUser(id);
    }

}
