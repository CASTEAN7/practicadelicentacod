package com.iucosoft.javaeefinalproject.dao;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author scostea
 */
public interface GenericDaoIntf<E, K> {
    
//    Session currentSession();

//    public E init();

    public K save(E entity);

    public E findById(K key);

    public void update(E entity);

    public void delete(K key);

    public List<E> list();
}
