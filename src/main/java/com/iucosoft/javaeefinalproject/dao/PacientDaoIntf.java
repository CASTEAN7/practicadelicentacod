package com.iucosoft.javaeefinalproject.dao;

import com.iucosoft.javaeefinalproject.entities.Pacient;

/**
 *
 * @author scostea
 */
public interface PacientDaoIntf extends GenericDaoIntf<Pacient, Integer>{
    public Pacient findByIdUser(int idUser);
}
