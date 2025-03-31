package com.iucosoft.javaeefinalproject.dao;

import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import java.util.List;


/**
 *
 * @author scostea
 */
public interface ConsultatieDaoIntf extends GenericDaoIntf<Consultatie, Integer> {
    List<Consultatie> findAllByPacient(int idPacient);
    List<Consultatie> findPageByPacient(Pacient pacient, int page);
//    public int countConsPacient(int pacientId);
//    public int countConsDoctor(int doctorId);
}
