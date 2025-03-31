package com.iucosoft.javaeefinalproject.dao.impl;

import com.iucosoft.javaeefinalproject.dao.GenericDaoIntf;
import com.iucosoft.javaeefinalproject.entities.Cart;
import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Doctor;
import com.iucosoft.javaeefinalproject.entities.Domeniu;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author scostea
 */
@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {AppConfig.class})  //treb sa fie asa!!!!! 
@ContextConfiguration(locations = {"/WEB-INF/applicationContext.xml"})
//@RunWith(Parameterized.class)
public class GenericDaoImplTest<K, E> {

    private static final Logger LOG = Logger.getLogger(GenericDaoImplTest.class.getName());

//  
    @Autowired
    private static GenericDaoImpl<Object, Integer> instance;
//    private static GenericDaoIntf<Object, Integer> instance;

    Consultatie consultatie;
    Doctor doctor;
    Domeniu domeniu;
    Pacient pacient;
    User user;
    Cart cart;

    @Parameterized.Parameter
    public Class<?> entityClass;  // This will hold the entity class for each test run

    private Object entity;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("SessionFactory created");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("SessionFactory destroyed");
    }

    @Before
    public void setUp() {
        System.out.println("Session created");
    }

    @After
    public void tearDown() {
        System.out.println("Session closed\n");
    }

    /**
     * Test of save method, of class GenericDaoImpl.
     */
    @Test
    public void testSave() {
        try {
            LOG.info("Test save");
            entity = createEntityInstance(entityClass);  // Pass the entity class here
            Object result = instance.save(entity);
            assertNotNull("Entity should have been saved", result);
        } catch (Exception ex) {
            LOG.severe("Eroare la save test" + ex.toString());
//            ex.printStackTrace();
        }

    }

    /**
     * Test of update method, of class GenericDaoImpl.
     */
//    @Test
    public void testUpdate() {
        System.out.println("update");
        Object entity = null;
//        GenericDaoImpl instance = new GenericDaoImpl();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class GenericDaoImpl.
     */
//    @Test
    public void testDelete() {
        System.out.println("delete");
        Object key = null;
//        GenericDaoImpl instance = new GenericDaoImpl();
//        instance.delete(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class GenericDaoImpl.
     */
//    @Test
    public void testFindById() {
        System.out.println("findById");
        Object key = null;
//        GenericDaoImpl instance = new GenericDaoImpl();
        Object expResult = null;
//        Object result = instance.findById(key);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class GenericDaoImpl.
     */
//    @Test
    public void testList() {
        System.out.println("list");
//        GenericDaoImpl instance = new GenericDaoImpl();
        List expResult = null;
        List result = instance.list();
        assertEquals(expResult, result);

    }

    // Factory method to create entity instances
    private Object createEntityInstance(Class<?> entityClass) {
        if (entityClass == User.class) {
            user = new User();
            user.setId(1);
            user.setPassword("passwordGeneric");
            user.setStatut("statutGeneric");
            user.setUsername("usernameGeneric");
            return user;
//        } else if (entityClass == Domeniu.class) {
//            domeniu = new Domeniu();
//            domeniu.setId(1);
//            domeniu.setDenumire("denumireGeneric");
//            domeniu.setIdDoctor(1);
//            domeniu.setNumeDoctor("numeDoctorGeneric");
//            domeniu.setPrenumeDoctor("prenumeDoctorGeneric");
//            return domeniu;
        } else if (entityClass == Doctor.class) {
            doctor = new Doctor();
            doctor.setId(1);
            doctor.setDomeniu("domeniuGenericDoc");
            doctor.setEmail("emailGeneric");
            doctor.setIdUser(1);
            doctor.setNume("numeGeneric");
            doctor.setPrenume("prenumeGeneric");
            doctor.setStart_date(Date.from(Instant.now()));
            doctor.setTelefon(61824747);
            return doctor;
        } else if (entityClass == Pacient.class) {
            pacient = new Pacient();
            pacient.setId(1);
            pacient.setNume("numeGeneric");
            pacient.setPrenume("prenumeGeneric");
            pacient.setDataNasterii(Date.from(Instant.now()));
            pacient.setEmail("emailGeneric");
            pacient.setTelefon(62788392);
            pacient.setIdUser(1);
            return pacient;
//        } else if (entityClass == Consultatie.class) {
//            consultatie.setId(1);
//            consultatie.setDescriere("descriereGeneric");
//            consultatie.setDomeniu("domeniuGeneric");
//            consultatie.setDataProgramarii(Date.from(Instant.now()));
//            consultatie.setUserByUsernameDoctor("username_doctorGeneric");
//            consultatie.setUserByUsernamePacient("username_pacientGeneric");
//            consultatie.setPret(222);
//            return consultatie;
        } else if (entityClass == Cart.class) {
            cart.setId(1);
            cart.setDomeniu("familia");
            cart.setPret(20);
            cart.setUsernamePacient("jora");
            return cart;
        } else {
            throw new IllegalArgumentException("Unknown entity class: " + entityClass);
        }
    }

    // Define the set of parameters to run the test on (all entity classes)
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {User.class}, {Domeniu.class}, {Doctor.class}, {Pacient.class}, {Consultatie.class}, {Cart.class}
        });
    }
}
