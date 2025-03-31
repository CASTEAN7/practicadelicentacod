package com.iucosoft.javaeefinalproject.services;

import java.util.List;

/**
 *
 * @author scostea
 */
public interface GenericServiceIntf<E, K> {

//    public E init();

    public K save(E entity);

    public E findById(K key);

    public void update(E entity);

    public void delete(K key);

    public List<E> list();
}
