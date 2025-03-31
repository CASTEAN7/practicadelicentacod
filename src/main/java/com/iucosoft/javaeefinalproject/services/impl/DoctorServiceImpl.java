package com.iucosoft.javaeefinalproject.services.impl;

import com.iucosoft.javaeefinalproject.dao.DoctorDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Doctor;
import com.iucosoft.javaeefinalproject.services.DoctorServiceIntf;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author scostea
 */
@Service("doctorService")
public class DoctorServiceImpl extends GenericServiceImpl<Doctor, Integer> implements DoctorServiceIntf{

    private static final Logger LOG = Logger.getLogger(DoctorServiceImpl.class.getName());

    @Autowired
    DoctorDaoIntf doctorDaointf;

    public DoctorServiceImpl() {
    }

    public DoctorServiceImpl(DoctorDaoIntf doctorDaointf) {
        this.doctorDaointf = doctorDaointf;
    }
    
    @Override
    @Transactional
    public Doctor findByDomeniu(String domeniu) {
            try {
            return doctorDaointf.findByDomeniu(domeniu);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }
    
}
