package com.iucosoft.javaeefinalproject.dao;

import com.iucosoft.javaeefinalproject.entities.User;
import java.util.List;

/**
 *
 * @author scostea
 */
public interface UserDaoIntf extends GenericDaoIntf<User, Integer>{
    
    public User validatePassword(String password);
    public User findByName(String username);
    public List<User> findByStatut(String statut);
    
}
