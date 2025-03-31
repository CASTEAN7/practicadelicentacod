package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.UserDaoIntf;
import com.iucosoft.javaeefinalproject.entities.User;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author scostea
 */
@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDaoIntf {

    private static final Logger LOG = Logger.getLogger(UserDaoImpl.class.getName());

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public User validatePassword(String password) {
        User user = null;
//        try (Session session = sessionFactory.openSession()) {
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM User WHERE password = :password";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("password", password);
            user = query.uniqueResult(); // Returns a single user or null if no match is found
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        return user;
    }

    @Override
    public User findByName(String username) {
        User user = null;
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM User WHERE username = :username";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("username", username);
            user = query.uniqueResult(); // Returns a single user or null if no match is found
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        if (user == null) {
            LOG.severe("User not found");
        }
        return user;
    }

    @Override
    public List<User> findByStatut(String statut) {
        List<User> users = null;
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM User WHERE statut = :statut";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("statut", statut);
            users = query.list(); // Retrieves the list of users matching the statut
        } catch (Exception e) {
            LOG.severe(e.toString());
//            throw new RuntimeException("Failed to retrieve users by statut", e);
        }
        return users;
    }

}
