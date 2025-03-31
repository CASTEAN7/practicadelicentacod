package com.iucosoft.javaeefinalproject.services.impl;

import com.iucosoft.javaeefinalproject.dao.UserDaoIntf;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.UserServiceIntf;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author scostea
 */
@Service("userService")
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserServiceIntf {

    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class.getName());

    @Autowired
    public UserDaoIntf userDaoIntf;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDaoIntf userDaoIntf) {
        this.userDaoIntf = userDaoIntf;
    }

    @Override
    @Transactional
    public User validatePassword(String password) {
        try {
            User user = userDaoIntf.validatePassword(password);
            return user;
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }

    @Override
    @Transactional
    public User findByName(String username) {
        try {
            return userDaoIntf.findByName(username);
        } catch (Exception e) {
            LOG.severe(e.toString());
            throw e;
        }
    }

    @Override
    @Transactional
    public List<User> findByStatut(String statut) {
        List<User> list = new ArrayList<>();
        try {
            list = userDaoIntf.findByStatut(statut);
        } catch (Exception e) {
            LOG.severe(e.toString());
        }
        return list;
    }

//    @Override
//    @Transactional
//    public void updateFaraPassword(User user) {
//        try {
//            userDaoIntf.updateFaraPassword(user);
//        } catch (Exception e) {
//            LOG.severe(e.toString());
//        }
//    }
//
//    @Override
//    @Transactional
//    public void updatePassword(User user) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
