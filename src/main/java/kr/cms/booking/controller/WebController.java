package kr.cms.booking.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class WebController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");

        return mav;
    }
}