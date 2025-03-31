package com.iucosoft.javaeefinalproject.services;

import com.iucosoft.javaeefinalproject.entities.Pacient;

/**
 *
 * @author scostea
 */
public interface PacientServiceIntf extends GenericServiceIntf<Pacient, Integer>{
    public Pacient findByIdUser(int idUser);
}
