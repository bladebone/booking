package kr.cms.booking.controller;

import kr.cms.booking.service.ConstService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class WebController {

    private ConstService constService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");

        mav.addObject("dayOfWeekList", constService.dayOfWeekList());

        return mav;
    }
}
