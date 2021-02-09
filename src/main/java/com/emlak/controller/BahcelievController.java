package com.emlak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.emlak.model.Bahceliev;
import com.emlak.services.BahcelievService;

@Controller
@RequestMapping(value="/bahceliev")
public class BahcelievController {

    @Autowired
    BahcelievService bahcelievService;


    @RequestMapping(value="/list", method= RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("bahceliev_list");
        List<Bahceliev> bahcelievList = bahcelievService. getAllBahceliev();
        model.addObject("bahcelievList", bahcelievList);

        return model;
    }



    @RequestMapping(value="/addBahceliev/", method=RequestMethod.GET)
    public ModelAndView addBahceliev() {

        ModelAndView model = new ModelAndView();
        Bahceliev bahceliev = new Bahceliev();
        model.addObject("bahcelievForm", bahceliev);
        model.setViewName("bahceliev_form");

        return model;
    }



    @RequestMapping(value="/editbahceliev/{id}", method=RequestMethod.GET)
    public ModelAndView editBahceliev(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Bahceliev bahceliev = bahcelievService.getBahcelievById(id);
        model.addObject("bahcelievForm", bahceliev);
        model.setViewName("bahceliev_form");

        return model;
    }

    @RequestMapping(value="/addBahceliev", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("bahcelievForm") Bahceliev bahceliev) {

        bahcelievService.addBahceliev(bahceliev);
        return new ModelAndView("redirect:/bahceliev/list");

    }

    @RequestMapping(value="/deleteBahceliev/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        bahcelievService.deleteBahceliev(id);
        return new ModelAndView("redirect:/bahceliev/list");

    }



}