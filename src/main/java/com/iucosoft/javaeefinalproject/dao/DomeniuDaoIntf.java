package com.iucosoft.javaeefinalproject.dao;

import com.iucosoft.javaeefinalproject.entities.Domeniu;

/**
 *
 * @author scostea
 */
public interface DomeniuDaoIntf extends GenericDaoIntf<Domeniu, Integer>{
    public Domeniu findByName(String denumire);
}
