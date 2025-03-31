package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.ConsultatieDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author scostea
 */
@Repository("consultatieDao")
public class ConsultatieDaoImpl extends GenericDaoImpl<Consultatie, Integer> implements ConsultatieDaoIntf {

    private static final Logger LOG = Logger.getLogger(ConsultatieDaoImpl.class.getName());

    private static final int limitResultsPerPage = 1;

    @Override
    public List<Consultatie> findAllByPacient(int idPacient) {
        List<Consultatie> consList = new ArrayList<>();
        long count = 0;
        try (Session session = sessionFactory.openSession()) {
            // Query to fetch all consultations
            String hqlList = "FROM Consultatie WHERE idPacient = :idPacient";
            Query<Consultatie> queryList = session.createQuery(hqlList, Consultatie.class);
            queryList.setParameter("idPacient", idPacient);
            consList = queryList.getResultList();
            // Query to count consultations
            String hqlCount = "SELECT COUNT(c) FROM Consultatie c WHERE idPacient = :idPacient";
            Query<Long> queryCount = session.createQuery(hqlCount, Long.class);
            queryCount.setParameter("idPacient", idPacient);
            count = queryCount.uniqueResult(); // Returns the count as a Long
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
        LOG.info("Number of consultations for idPacient " + idPacient + ": " + count);
        if (consList.isEmpty()) {
            LOG.severe("No consultations found for idPacient: " + idPacient);
        }

        return consList;
    }

    @Override
    public List<Consultatie> findPageByPacient(Pacient pacient, int page) {
        Session session = sessionFactory.openSession();
        Query<Consultatie> query = session.createQuery(
                "FROM Consultatie WHERE pacient = CONCAT(:nume, ' ', :prenume)",
                Consultatie.class
        );
        query.setParameter("nume", pacient.getNume());
        query.setParameter("prenume", pacient.getPrenume());
        query.setFirstResult(page * limitResultsPerPage);
        query.setMaxResults(limitResultsPerPage);
        return query.getResultList();
    }

//    @Override
//    public long countConsultatiiByPacient(Pacient pacient) {
//        Session session = sessionFactory.openSession();
//        Query<Long> query = session.createQuery(
//                "SELECT COUNT(c) FROM Consultatie c WHERE c.pacient = CONCAT(:nume, ' ', :prenume)",
//                Long.class
//        );
//        query.setParameter("nume", pacient.getNume());
//        query.setParameter("prenume", pacient.getPrenume());
//        return query.getSingleResult();
//    }
//sus mai este randul 19
}
