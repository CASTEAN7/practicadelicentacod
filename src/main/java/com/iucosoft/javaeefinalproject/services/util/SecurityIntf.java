package com.iucosoft.javaeefinalproject.services.util;

import com.iucosoft.javaeefinalproject.entities.User;



/**
 *
 * @author scostea
 */
public interface SecurityIntf {

    User validatePassword(String password) throws Exception;
    
//    boolean checkAdmin(String password) throws Exception;

}
