package com.emlak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.emlak.model.Mulk;
import com.emlak.services.MulkService;

@Controller
@RequestMapping(value="/mulk")
public class MulkController {

    @Autowired
    MulkService mulkService;


    @RequestMapping(value="/list", method= RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("mulk_list");
        List<Mulk> mulkList = mulkService. getAllMulk();
        model.addObject("mulkList", mulkList);

        return model;
    }


    @RequestMapping(value="/addMulk/", method=RequestMethod.GET)
    public ModelAndView addMulk() {

        ModelAndView model = new ModelAndView();
        Mulk mulk = new Mulk();
        model.addObject("mulkForm", mulk);
        model.setViewName("mulk_form");

        return model;
    }


    @RequestMapping(value="/editmulk/{id}", method=RequestMethod.GET)
    public ModelAndView editMulk(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Mulk mulk = mulkService.getMulkById(id);
        model.addObject("mulkForm", mulk);
        model.setViewName("mulk_form");

        return model;
    }

    @RequestMapping(value="/addMulk", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("mulkForm") Mulk mulk) {

        mulkService.addMulk(mulk);
        return new ModelAndView("redirect:/mulk/list");

    }

    @RequestMapping(value="/deleteMulk/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        mulkService.deleteMulk(id);
        return new ModelAndView("redirect:/mulk/list");
    }


}