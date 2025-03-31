package com.iucosoft.javaeefinalproject.services.impl;

import com.iucosoft.javaeefinalproject.dao.DomeniuDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Domeniu;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.DomeniuServiceIntf;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author scostea
 */
@Service("domeniuService")
public class DomeniuServiceImpl extends GenericServiceImpl<Domeniu, Integer> implements DomeniuServiceIntf {

    private static final Logger LOG = Logger.getLogger(DomeniuServiceImpl.class.getName());

    @Autowired
    public DomeniuDaoIntf domeniuDaoIntf;

    public DomeniuServiceImpl() {
    }

    public DomeniuServiceImpl(DomeniuDaoIntf domeniuDaoIntf) {
        this.domeniuDaoIntf = domeniuDaoIntf;
    }

    @Override
    @Transactional
    public Domeniu findByName(String denumire) {
        try {
            return domeniuDaoIntf.findByName(denumire);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }
}
