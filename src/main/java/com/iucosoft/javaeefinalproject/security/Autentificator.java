package com.iucosoft.javaeefinalproject.security;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.util.SecurityIntf;
import java.util.logging.Logger;

/**
 *
 * @author scostea
 */
public class Autentificator {
    
    private static final Logger LOG = Logger.getLogger(Autentificator.class.getName());
    
    SecurityIntf securityIntf;
    
    public User autentifica(String username, String password){
        try {
            User user = securityIntf.validatePassword(password);
            return user;
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw new RuntimeException("Eroare la metoda autentifica");
        }
}
    
}
