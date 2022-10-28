package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Transactional
    public void update(User user) {
        entityManager.merge(user);
    }

    public List<User> getAll() {
        Query selectAll = entityManager.createQuery("SELECT u FROM User u");
        return selectAll.getResultList();
    }

    public List<User> getByAge(int age) {
        Query selectByAge = entityManager.createQuery("select user FROM User user WHERE user.age=:age");
        selectByAge.setParameter("age", age);
        return selectByAge.getResultList();
    }

    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void delete(Long id) {
        User user = findById(id);
        if (user == null) {
            System.out.println("User not found! 404");
        } else {
            entityManager.remove(user);
        }
    }

}
