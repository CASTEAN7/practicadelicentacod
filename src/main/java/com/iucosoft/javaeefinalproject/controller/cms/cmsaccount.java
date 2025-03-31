package com.iucosoft.javaeefinalproject.controller.cms;

import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.DoctorServiceIntf;
import com.iucosoft.javaeefinalproject.services.PacientServiceIntf;
import com.iucosoft.javaeefinalproject.services.UserServiceIntf;
import com.iucosoft.javaeefinalproject.util.StringToDateConverter;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author scostea
 */
@Controller
public class cmsaccount {

    private static final Logger LOG = Logger.getLogger(cmsaccount.class.getName());

    @Autowired
    PacientServiceIntf pacientServicesIntf;

    @Autowired
    DoctorServiceIntf doctorServiceIntf;

    @Autowired
    UserServiceIntf userServiceIntf;
    
    StringToDateConverter stringToDateConverter;
    
    String page = "";
    String nume;
    String prenume;
    String data_nasteriiStr;
    String telefon;
    String email;
    LocalDate data_nasteriiString;

    @PostMapping("/cmsaccount")
    public String processAccEdit(@RequestParam(value = "action") String action, HttpSession session, Model model, @ModelAttribute Pacient pacient) {

        try {
            if (action == null) {
                page = arataDatele(session, model, pacient);
            } else {
                page = updateDatele(session, model, pacient);
            }
        } catch (Exception e) {
            LOG.info("eroare la try!");
            page = "error";
        }

        return "";
    }

    @GetMapping("/cmsaccount")
    public String arataDatele(HttpSession session, Model model, @ModelAttribute Pacient pacient) {
        try {
            User user = (User) session.getAttribute("user");
            Pacient pacientDb = pacientServicesIntf.findByIdUser(user.getId());
//            System.out.println("pacient este "+pacientDb);
            model.addAttribute("pacient", pacientDb); // Passing the entire User object
            page = "cms/cmsaccount";
        } catch (Exception e) {
            LOG.info("eroare la try in cmsgeneric!!!!");
            page = "error";
        }
        return page;
    }

    public String updateDatele(
            HttpSession session, Model model, @ModelAttribute Pacient pacient) {
        try {
            pacientServicesIntf.update(pacient);
            page = "home";
        } catch (Exception e) {
            page = "error";
            LOG.severe(e.toString());
        }
        return page;
    }

}
