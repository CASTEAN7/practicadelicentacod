package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.PacientDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author scostea
 */
@Repository("pacientDao")
public class PacientDaoImpl extends GenericDaoImpl<Pacient, Integer> implements PacientDaoIntf {

    private static final Logger LOG = Logger.getLogger(PacientDaoImpl.class.getName());
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Pacient findByIdUser(int idUser) {
        Pacient pacient = null;
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM Pacient WHERE idUser = :idUser";
            Query<Pacient> query = session.createQuery(hql, Pacient.class);
            query.setParameter("idUser", idUser);
            pacient = query.uniqueResult(); // Returns a single user or null if no match is found
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        if (pacient == null) {
           LOG.severe("pacient not found");
        }
        return pacient;
    }
}
