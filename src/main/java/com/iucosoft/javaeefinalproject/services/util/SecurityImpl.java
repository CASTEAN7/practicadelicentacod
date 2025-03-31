package com.iucosoft.javaeefinalproject.services.util;

import com.iucosoft.javaeefinalproject.dao.UserDaoIntf;
import com.iucosoft.javaeefinalproject.entities.User;
import java.sql.SQLException;

/**
 *
 * @author scostea
 */
public class SecurityImpl implements SecurityIntf {


    private UserDaoIntf userDaoIntf;
    private static SecurityImpl instance;

    private SecurityImpl(UserDaoIntf userDaoIntf) {
        this.userDaoIntf = userDaoIntf;
    }

    public static SecurityImpl getInstance(UserDaoIntf userDaoIntf) {
        if (instance == null) {
//            instance = new SecurityImpl(userDaoIntf);
            instance = new SecurityImpl(userDaoIntf);
        }
        return instance;
    }

    @Override
    public User validatePassword(String password) throws SQLException {
        User user = userDaoIntf.validatePassword( password);
        return user;
    }

//    @Override
//    public boolean checkAdmin(String username, String password) throws SQLException {
//        String adminName = "admin";
//        String adminPassword = "admin";
//        if (adminName == username && adminPassword == password) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
