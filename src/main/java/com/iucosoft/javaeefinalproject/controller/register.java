package com.iucosoft.javaeefinalproject.controller;

import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.PacientServiceIntf;
import com.iucosoft.javaeefinalproject.services.UserServiceIntf;
import java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author scostea
 */
@Controller
public class register {

    private static final Logger LOG = Logger.getLogger(register.class.getName());

    @Autowired
    UserServiceIntf userServicesIntf;

    @Autowired
    PacientServiceIntf pacientServiceIntf;

    @PostMapping("/register")
    public String processRegister(
            @RequestParam(value = "firstname") String firstname,
            @RequestParam(value = "lastname") String lastname,
            @RequestParam("birthdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate birthdate,
            @RequestParam(value = "phonenumber") String phonenumber,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "confirmPassword") String confirmPassword,
            @RequestParam(value = "action") String action) {

        String statut = "Pacient";
        String pageRedirect = "";
        try {
            if ("save".equals(action) && password.equals(confirmPassword)) {
//                Validator validator = new Validator();
//
//                // Validate inputs
//                validator.valideazaLogin(password);
//
                // Save User
                User user = new User(0, username, password, statut);
                userServicesIntf.save(user);
                LOG.info("salvat cu success!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 " + user);

//                 Find User and save Pacient
                User user1 = userServicesIntf.findByName(username);
                LOG.info("User salvat este " + user1);
                Pacient pacient = new Pacient(0, firstname, lastname, Date.valueOf(birthdate),
                        Integer.valueOf(phonenumber), email, user1.getId());
                pacientServiceIntf.save(pacient);
                LOG.info("Pacient salvat cu success!!!!! " + pacient);

//                // Redirect to login page
                pageRedirect = "redirect:/login";
            } else {
                throw new Exception("Invalid action or passwords do not match.");
            }
        } catch (Exception ex) {
            LOG.info("eroare la try!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            pageRedirect = "error";
        }
        return pageRedirect;

    }
}
