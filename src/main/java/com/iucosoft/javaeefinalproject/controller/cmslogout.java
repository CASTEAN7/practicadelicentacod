package com.iucosoft.javaeefinalproject.controller;

import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author scostea
 */
@Controller
public class cmslogout {

    private static final Logger LOG = Logger.getLogger(cmslogout.class.getName());

    String page = "";

    @RequestMapping("/cmslogout")
    public String processLogin(HttpSession session) {
        try {
            if (session != null) {
                session.invalidate();
                LOG.info("Session invalidated successfully.");
            } else {
                LOG.warning("No session to invalidate.");
            }
            page = "index";

        } catch (Exception ex) {
            LOG.severe(ex.toString());
            page = "error";
        }
        return page;
    }
}
