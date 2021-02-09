package com.emlak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.emlak.model.Dukkan;
import com.emlak.services.DukkanService;

@Controller
@RequestMapping(value="/dukkan")
public class DukkanController {

    @Autowired
    DukkanService dukkanService;


    @RequestMapping(value="/list", method= RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("dukkan_list");
        List<Dukkan> dukkanList = dukkanService. getAllDukkan();
        model.addObject("dukkanList", dukkanList);

        return model;
    }



    @RequestMapping(value="/addDukkan/", method=RequestMethod.GET)
    public ModelAndView addDukkan() {

        ModelAndView model = new ModelAndView();
        Dukkan dukkan = new Dukkan();
        model.addObject("dukkanForm", dukkan);
        model.setViewName("dukkan_form");

        return model;
    }



    @RequestMapping(value="/editdukkan/{id}", method=RequestMethod.GET)
    public ModelAndView editDukkan(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Dukkan dukkan = dukkanService.getDukkanById(id);
        model.addObject("dukkanForm", dukkan);
        model.setViewName("dukkan_form");

        return model;
    }

    @RequestMapping(value="/addDukkan", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("dukkanForm") Dukkan dukkan) {

        dukkanService.addDukkan(dukkan);
        return new ModelAndView("redirect:/dukkan/list");

    }

    @RequestMapping(value="/deleteDukkan/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        dukkanService.deleteDukkan(id);
        return new ModelAndView("redirect:/dukkan/list");

    }



}