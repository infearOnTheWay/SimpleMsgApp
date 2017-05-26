package com.app.msg.controller;

import com.app.msg.security.UserSessionInfo;
import com.app.msg.security.WebSecurityConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * Created by infear on 2017/5/26.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(@SessionAttribute(WebSecurityConfig.SESSION_KEY) UserSessionInfo info, Model model) {
        model.addAttribute("info", info);
        return "index";
    }
}