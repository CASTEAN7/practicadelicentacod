package com.iucosoft.javaeefinalproject.services;

import com.iucosoft.javaeefinalproject.entities.User;
import java.util.List;

/**
 *
 * @author scostea
 */
public interface UserServiceIntf extends GenericServiceIntf<User, Integer>{
    
    public User validatePassword(String password);
    public User findByName(String username);
    public List<User> findByStatut(String statut);
//    void updateFaraPassword(User user);
//    void updatePassword(User user);
    
}
