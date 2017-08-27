package org.NeilAlishev.blockchain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.NeilAlishev.blockchain.util.ApplicationUrls.LOGIN_URL;

/**
 * @author aleksandrpliskin on 28.08.17.
 */
@Controller
public class AuthController {

    @GetMapping(LOGIN_URL)
    public String login(@RequestParam(value = "error", required = false) Boolean error,
                        Model model) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "sign_in";
    }

}
