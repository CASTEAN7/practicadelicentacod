package com.iucosoft.javaeefinalproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author scostea
 */
@Controller
public class home {
    @RequestMapping("/")
    String index(){
    
        return "index";
    }
    
//    @RequestMapping("/consultatie")
//    String altaMetoda(){
//    
//        
//        return "cms/consultatiepacientview";
//    }
}
