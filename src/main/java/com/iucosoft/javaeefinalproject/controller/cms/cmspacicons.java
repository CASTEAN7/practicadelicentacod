package com.iucosoft.javaeefinalproject.controller.cms;

import com.iucosoft.javaeefinalproject.entities.Consultatie;
import com.iucosoft.javaeefinalproject.entities.Pacient;
import com.iucosoft.javaeefinalproject.entities.User;
import com.iucosoft.javaeefinalproject.services.ConsultatieServiceIntf;
import com.iucosoft.javaeefinalproject.services.PacientServiceIntf;
import com.iucosoft.javaeefinalproject.services.UserServiceIntf;
import java.util.List;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author scostea
 */
@Controller
public class cmspacicons {

    private static final Logger LOG = Logger.getLogger(cmspacicons.class.getName());

    @Autowired
    ConsultatieServiceIntf consultatieServiceIntf;

    @Autowired
    UserServiceIntf userServiceIntf;

    @Autowired
    PacientServiceIntf pacientServicesIntf;

    String page = "";

    @PostMapping("/cmspacicons")
    public String ProcessAction(@RequestParam(value = "action") String action, HttpSession session, Model model, @ModelAttribute Consultatie consultatie) {
        LOG.info("am intrat in ProcessAction");
        try {
            if (action == null) {
                page = getAppointments(session, model, consultatie);
            }

        } catch (Exception e) {
            LOG.info("eroare la try!");
            page = "error";
        }

        return "";
    }

    @GetMapping("/cmspacicons")
    public String getAppointments(HttpSession session, Model model, @ModelAttribute Consultatie consultatie) {
        try {
            User user = (User) session.getAttribute("user");
            Pacient pacient = pacientServicesIntf.findByIdUser(user.getId());
            List<Consultatie> listCons = consultatieServiceIntf.findAllByPacient(pacient.getId());
            model.addAttribute("consultatie", listCons);
            if(listCons==null){
                LOG.severe("lista e null");
            }else{
            page = "/cms/cmspacicons";
            }
        } catch (Exception e) {
            LOG.info("eroare la try in cmsgeneric!!!!");
            page = "error";
        }
        return page;
    }
    //        int totalAppointments = consultatieServiceIntf.findAllByPacient(fullName);
//        List<Appointment> appointments = appointmentService.getAppointments(0, 10); // Fetch first page
//        model.addAttribute("appointments", appointments);
//        model.addAttribute("totalAppointments", totalAppointments);
    
 
//    @RequestMapping("/consultatii")
//    public String getConsultatiiPage(
//        @RequestParam(value = "page", defaultValue = "0") int page,
//        @RequestParam(value = "nume", required = true) String nume,
//        @RequestParam(value = "prenume", required = true) String prenume,
//        Model model) {
//
//        try {
//            // Prepare Pacient object based on the request parameters
//            Pacient pacient = new Pacient();
//            pacient.setNume(nume);
//            pacient.setPrenume(prenume);
//
//            // Call service to get paginated consultatii
//            List<Consultatie> consultatii = consultatieServiceIntf.findPageByPacient(pacient, page);
//
//            // Get total count of consultatii to calculate total pages
//            long totalConsultatii = consultatieServiceIntf.getTotalConsultatiiByPacient(pacient);
//            int totalPages = (int) Math.ceil(totalConsultatii / (double) limitResultsPerPage);
//
//            // Add data to the model
//            model.addAttribute("consultatii", consultatii);
//            model.addAttribute("currentPage", page);
//            model.addAttribute("totalPages", totalPages);
//            model.addAttribute("totalConsultatii", totalConsultatii);
//            model.addAttribute("nume", nume);
//            model.addAttribute("prenume", prenume);
//        } catch (Exception e) {
//            model.addAttribute("error", "Error occurred while fetching data: " + e.getMessage());
//        }
//
//        return "consultatii"; // JSP page
//    }


}
