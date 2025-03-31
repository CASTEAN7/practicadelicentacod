package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.DoctorDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Doctor;
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
@Repository("doctorDao")
public class DoctorDaoImpl extends GenericDaoImpl<Doctor, Integer> implements DoctorDaoIntf {

    private static final Logger LOG = Logger.getLogger(DoctorDaoImpl.class.getName());

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Doctor findByDomeniu(String domeniu) {
        Doctor doctor = null;
        try (Session session = sessionFactory.openSession()) {
            String hql = "FROM Doctor WHERE domeniu = :domeniu";
            Query<Doctor> query = session.createQuery(hql, Doctor.class);
            query.setParameter("domeniu", domeniu);
            doctor = query.uniqueResult(); // Returns a single user or null if no match is found
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        if (doctor == null) {
            LOG.severe("Doctor not found");
        }
        return doctor;
    }

}
