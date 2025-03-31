package com.iucosoft.javaeefinalproject.services;

import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import java.util.List;

/**
 *
 * @author scostea
 */
public interface ConsultatieServiceIntf extends GenericServiceIntf<Consultatie, Integer> {
     List<Consultatie> findAllByPacient(int idPacient);
         List<Consultatie> findPageByPacient(Pacient pacient, int page);

}
