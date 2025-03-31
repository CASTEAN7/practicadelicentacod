package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.CartDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Cart;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author scostea
 */
@Repository("cartDao")
public class CartDaoImpl extends GenericDaoImpl<Cart, Integer> implements CartDaoIntf {

//    public CartDaoImpl() {
//        typeParameterClass = Cart.class;
//    }

    
    

}
