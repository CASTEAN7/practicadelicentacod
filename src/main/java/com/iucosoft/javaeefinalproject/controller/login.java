package com.iucosoft.javaeefinalproject.controller;

import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.security.Validator;
import com.iucosoft.javaeefinalproject.services.UserServiceIntf;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author scostea
 */
@Controller
public class login {

    private static final Logger LOG = Logger.getLogger(login.class.getName());

    User user;

    @Autowired
    UserServiceIntf userServicesIntf;

    @PostMapping("/login")
    public String processLogin(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password, 
            @RequestParam(value = "action") String action, HttpSession session) {
        String pageRedirect = "";
        Validator validator = new Validator();

        try {
//            Validator.valideazaLogin(username, password);
            validator.valideazaLogin(password);
//            user = userServicesIntf.checkByUsernamePassword(username, password);
            user = userServicesIntf.validatePassword(password);
            if (user != null) {
                session.setAttribute("user", user);
                if (user.getStatut().equals("Admin") && action.equals("login")) {
                    pageRedirect = "cms/cmsadminview";
                } else if (user.getStatut().equals("Doctor") && action.equals("login")) {
                    pageRedirect = "cms/cmsdoctorview";
                }else if (user.getStatut().equals("Pacient") && action.equals("login")) {
                pageRedirect = "cms/cmspacientview";
            }
//                if (action.equals("login")) {
//                
//                }
        }
    }
    catch (Exception e) {
        pageRedirect = "error";
        LOG.severe(e.toString());
        }
    return pageRedirect;
}
//
//// Setting a session attribute
//    @RequestMapping("/setSession")
//    public String setSession(HttpSession session) {
//        session.setAttribute("user", user); // Setting the session attribute directly
//        return "sessionSet"; // Return a view
//    }
//
//    // Getting the session attribute
//    @RequestMapping("/getSession")
//    public String getSession(HttpSession session) {
//        String user = (String) session.getAttribute("user"); // Getting the session attribute directly
//        return "sessionView"; // Return a view
//    }
}
