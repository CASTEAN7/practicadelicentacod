package com.iucosoft.javaeefinalproject.controller.cms;

import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Doctor;
import com.iucosoft.javaeefinalproject.entities.Domeniu;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.ConsultatieServiceIntf;
import com.iucosoft.javaeefinalproject.services.DoctorServiceIntf;
import com.iucosoft.javaeefinalproject.services.DomeniuServiceIntf;
import com.iucosoft.javaeefinalproject.services.PacientServiceIntf;
import com.iucosoft.javaeefinalproject.services.UserServiceIntf;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author scostea
 */
@Controller
public class cmsgeneric {

    private static final Logger LOG = Logger.getLogger(cmsgeneric.class.getName());

    @Autowired
    PacientServiceIntf pacientServicesIntf;

    @Autowired
    DoctorServiceIntf doctorServiceIntf;

    @Autowired
    ConsultatieServiceIntf consultatieServiceIntf;

    @Autowired
    UserServiceIntf userServiceIntf;
    
    @Autowired
    DomeniuServiceIntf domeniuServiceIntf;

    
    
    
    @GetMapping("/cmsgeneric")
    public String loadPage(@RequestParam("name") String denumire, Model model) {
        System.out.println("Am intrat in loadPage");
        Domeniu dom = domeniuServiceIntf.findByName(denumire);
        model.addAttribute("denumire", denumire);
        model.addAttribute("info", "Information about " + dom.getDescriere()); // Replace with DB data
        System.out.println("Information about " + dom.getDescriere());
        return "/cms/cmsgeneric"; // Redirects to cmsgeneric.jsp
    }
    
    
//    
//    @PostMapping("/cmsgeneric")
//    public String processConsult(
//            @RequestParam("month") int month,
////            @RequestParam("time") String time,
//            @RequestParam(value = "action") String action, HttpSession session
//    ) {
//        System.out.println("Am intrat in cmsgeneric");
//        String page = "";
//        User user = (User) session.getAttribute("user");
//        System.out.println("user este " + user);
//
//        
//        //aici e problema cu ziua la data
//        LocalDate appointmentDate = LocalDate.of(LocalDate.now().getYear(), month, 1);
////        LocalTime appointmentTime = LocalTime.parse(time);
//
//        try {
//            if (action.equals("submit")) {
//
//                //find pacient by id user
//                Pacient pacient = pacientServicesIntf.findByIdUser(user.getId());
//                System.out.println("pacientul dupa userID " + pacient);
//                int idPacient = pacient.getId();
////                String nume = pacient.getNume();
////                String prenume = pacient.getPrenume();
////                String fullName = nume +" "+ prenume;
////                System.out.println("fullname = " + fullName);
//
//                //Doctorul
////             Doctor doctor = new Doctor();
////             doctor.setNume("Misa");
////             doctor.setPrenume("Smith");
////             String 
//                Doctor doctor = doctorServiceIntf.findByDomeniu("chirurg");
//                int idDoctor = doctor.getId();
////                String numeDoc = doctor.getNume();
////                String prenumeDoc = doctor.getPrenume();
////                String fullnameDoc = numeDoc +" "+ prenumeDoc;
////                System.out.println("fullnamedoctor = " + fullnameDoc);
//
//                //Domeniu
//                Domeniu domeniu = new Domeniu();
//                domeniu.setDenumire("Chirurgie");
//                String denumire = domeniu.getDenumire();
//                System.out.println("denumire = " + denumire);
//
////                Consultatie consultatie = new Consultatie(0, fullName, fullnameDoc,
////                        denumire, Date.valueOf(appointmentDate), time, "MihaiViteazu", 200, "processing");
//                Consultatie consultatie = new Consultatie(0, idPacient, idDoctor,
//                        denumire, Date.valueOf(appointmentDate), "MihaiViteazu", 200, "processing");
//
//                consultatieServiceIntf.save(consultatie);
//                System.out.println("salvat cu success! " + consultatie);
//
//                page = "cms/cmspacientview";
//            } else if (action.equals("submit") && user == null) {
//                throw new Exception("Am ajuns in eslse, user este null" + user);
//            } else {
//                throw new Exception("Am ajuns in eslse, ceea ce inseamna eroare undeva in if");
//            }
//        } catch (Exception e) {
//            LOG.info("eroare la try in cmsgeneric!!!!");
//            page = "error";
//        }
//        return page;
//    }
}
