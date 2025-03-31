package com.iucosoft.javaeefinalproject.services.impl;

import com.iucosoft.javaeefinalproject.dao.GenericDaoIntf;
import com.iucosoft.javaeefinalproject.services.GenericServiceIntf;
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
@Service("genericService")
public class GenericServiceImpl<E, K> implements GenericServiceIntf<E, K> {

    private static final Logger LOG = Logger.getLogger(GenericServiceImpl.class.getName());

    @Autowired
    public GenericDaoIntf<E, K> genericDao;

    public GenericServiceImpl() {
    }

    public GenericServiceImpl(GenericDaoIntf<E, K> genericDao) {
        this.genericDao = genericDao;
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public K save(E entity) {
        try {
          return (K) genericDao.save(entity);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public E findById(K key) {
        try {
            return genericDao.findById(key);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void update(E entity) {
        try {
            genericDao.update(entity);
        } catch (Exception e) {
            LOG.severe(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public void delete(K key) {
        try {
            genericDao.delete(key);
        } catch (Exception e) {
            LOG.severe(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<E> list() {
        List<E> list = new ArrayList<>();
        try {
            list = genericDao.list();
        } catch (Exception e) {
            LOG.severe(e.toString());
        }
        return list;
    }

}
