package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.GenericDaoIntf;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author scostea
 */
@Repository("genericDao")
public class GenericDaoImpl<E, K extends Serializable> implements GenericDaoIntf<E, K> {

    @Autowired
    SessionFactory sessionFactory;

    Class<E> typeParameterClass;

    @Override
    public K save(E entity) {
        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        session.getTransaction().commit();
        return (K) session.save(entity);

    }

    @Override
    public void update(E entity) {
//        sessionFactory.getCurrentSession().update(entity);
        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
        session.update(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void delete(K key) {
//        E entity = (E) sessionFactory.getCurrentSession().get(daoType, key);
//        E entity = (E) sessionFactory.getCurrentSession().get(getClass(), key);
//        if (entity != null) {
//            sessionFactory.getCurrentSession().delete(entity);
//        }

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(key);
        session.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    @Override
    public E findById(K key) {
//        return (E) sessionFactory.getCurrentSession().get(daoType, key);
//        return (E) sessionFactory.getCurrentSession().get(getClass(), key);

        Session session = sessionFactory.getCurrentSession();
        return (E) session.get(getClass(), key);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> list() {
//        Session currentSession = sessionFactory.getCurrentSession();
////        String hql = "form " + daoType.getName();
////        String hql = "from " + daoType.getName(); correct
//        String hql = "from " + getClass();
//        return currentSession.createQuery(hql).list();

        Session session = sessionFactory.getCurrentSession();
        String hql = "from " + getClass();
        return session.createQuery(hql).list();
        
    }

}
