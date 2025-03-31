package com.iucosoft.javaeefinalproject.services;

import com.iucosoft.javaeefinalproject.entities.Doctor;

/**
 *
 * @author scostea
 */
public interface DoctorServiceIntf extends GenericServiceIntf<Doctor, Integer> {
    public Doctor findByDomeniu(String domeniu);
}
