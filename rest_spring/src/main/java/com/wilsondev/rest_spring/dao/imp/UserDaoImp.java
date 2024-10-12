package com.wilsondev.rest_spring.dao.imp;

import com.wilsondev.rest_spring.dao.UserDao;
import com.wilsondev.rest_spring.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<User> obtenerUsers() {
        String hql = "FROM User as u";
        return (List<User>) entityManager.createQuery(hql).getResultList();
    }

    @Transactional
    @Override
    public User obtenerUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public User registerUser(User user) {

        return entityManager.merge(user);
    }

    @Transactional
    @Override
    public User updateUser(User user) {
        return entityManager.merge(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        User user = obtenerUser(id);
         entityManager.remove(user);

    }
}
