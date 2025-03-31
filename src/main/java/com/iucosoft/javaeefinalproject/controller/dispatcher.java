package com.iucosoft.javaeefinalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author scostea
 */
@Controller
public class dispatcher {

    @GetMapping("/{pageName}")
    public String switchPage(@PathVariable("pageName") String pageName) {
        switch (pageName) {
            case "home":
                return "index";  // Returns home.jsp (in /WEB-INF/pages/)
            case "Consultatii":
                return "error";  // Returns consultatii.jsp (in /WEB-INF/pages/)
            case "OferteSiPromotii":
                return "error";  // Returns consultatii.jsp (in /WEB-INF/pages/)
            case "DespreNoi":
                return "error";  // Returns despreNoi.jsp (in /WEB-INF/pages/)
            case "Cariere":
                return "error";  // Returns cariere.jsp (in /WEB-INF/pages/)
            case "login":
                return "login"; 
            case "register":
                return "register";  
            case "adresa":
                return "adresa";  
            case "consultatie":
                return "cms/cmsconsultatie";  
            case "cmspacientview":
                return "cms/cmspacientview";  
            case "cmsgeneric":
                return "cms/cmsgeneric";  
            case "cmsaccount":
                return "cms/cmsaccount";  
            case "cmspacicons":
                return "cms/cmspacicons";  
            default:
                return "error";  // Returns error.jsp if the page name is invalid
        }
    }
}
