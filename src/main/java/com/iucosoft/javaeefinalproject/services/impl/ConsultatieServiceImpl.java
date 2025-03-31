package com.iucosoft.javaeefinalproject.services.impl;

import com.iucosoft.javaeefinalproject.dao.ConsultatieDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.services.ConsultatieServiceIntf;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author scostea
 */
@Service("consultatieService")
public class ConsultatieServiceImpl extends GenericServiceImpl<Consultatie, Integer> implements ConsultatieServiceIntf {

    private static final Logger LOG = Logger.getLogger(ConsultatieServiceImpl.class.getName());

    @Autowired
    public ConsultatieDaoIntf consultatieDaoIntf;

    public ConsultatieServiceImpl() {
    }

    public ConsultatieServiceImpl(ConsultatieDaoIntf consultatieDaoIntf) {
        this.consultatieDaoIntf = consultatieDaoIntf;
    }

    @Override
    @Transactional
    public List<Consultatie> findAllByPacient(int idPacient) {
        List<Consultatie> list = new ArrayList<>();
        try {
            list = consultatieDaoIntf.findAllByPacient(idPacient);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        return list;
    }

    @Override
    public List<Consultatie> findPageByPacient(Pacient pacient, int page) {
        List<Consultatie> list = new ArrayList<>();
        try {
            list = consultatieDaoIntf.findPageByPacient(pacient, page);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        return list;
    }
    
//    @Override
//public long getTotalConsultatiiByPacient(Pacient pacient) {
//    try {
//        return consultatieDaoIntf.countConsultatiiByPacient(pacient);
//    } catch (Exception e) {
//        LOG.severe(e.toString());
//        throw e;
//    }
//}
 
}
