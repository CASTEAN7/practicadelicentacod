package com.iucosoft.javaeefinalproject.services;

import com.iucosoft.javaeefinalproject.entities.Domeniu;

/**
 *
 * @author scostea
 */
public interface DomeniuServiceIntf extends GenericServiceIntf<Domeniu, Integer>{
    public Domeniu findByName(String denumire);
}
