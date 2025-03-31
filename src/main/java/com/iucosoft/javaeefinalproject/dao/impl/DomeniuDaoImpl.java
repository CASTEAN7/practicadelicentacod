package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.DomeniuDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Domeniu;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author scostea
 */
@Repository("domeniuDao")
public class DomeniuDaoImpl extends GenericDaoImpl<Domeniu, Integer> implements DomeniuDaoIntf {

    private static final Logger LOG = Logger.getLogger(DomeniuDaoImpl.class.getName());

    @Override
    public Domeniu findByName(String denumire) {
        Domeniu domeniu = null;
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM Domeniu WHERE denumire = :denumire";
            Query<Domeniu> query = session.createQuery(hql, Domeniu.class);
            query.setParameter("denumire", denumire);
            domeniu = query.uniqueResult(); // Returns a single domeniu or null if no match is found
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        if (domeniu == null) {
            LOG.severe("Domeniu not found");
        }
        return domeniu;
    }

}
