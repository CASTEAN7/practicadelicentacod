package com.iucosoft.javaeefinalproject.dao;

import com.iucosoft.javaeefinalproject.entities.Doctor;

/**
 *
 * @author scostea
 */
public interface DoctorDaoIntf extends GenericDaoIntf<Doctor, Integer>{
     public Doctor findByDomeniu(String domeniu);
}
