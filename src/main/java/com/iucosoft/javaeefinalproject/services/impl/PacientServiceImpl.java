package com.iucosoft.javaeefinalproject.services.impl;

import com.iucosoft.javaeefinalproject.dao.PacientDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.services.PacientServiceIntf;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author scostea
 */
@Service("pacientService")
public class PacientServiceImpl extends GenericServiceImpl<Pacient, Integer> implements PacientServiceIntf {

    private static final Logger LOG = Logger.getLogger(PacientServiceImpl.class.getName());

    @Autowired
    public PacientDaoIntf pacientDaoIntf;

    public PacientServiceImpl() {
    }

    public PacientServiceImpl(PacientDaoIntf pacientDaoIntf) {
        this.pacientDaoIntf = pacientDaoIntf;
    }
    
    @Override
    @Transactional
    public Pacient findByIdUser(int idUser) {
        try {
            return pacientDaoIntf.findByIdUser(idUser);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }

}
