package com.emlak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.emlak.model.Apartmandaire;
import com.emlak.services.ApartmandaireService;

@Controller
@RequestMapping(value="/apartmandaire")
public class ApartmandaireController {

    @Autowired
    ApartmandaireService apartmandaireService;


    @RequestMapping(value="/list", method= RequestMethod.GET)
    public ModelAndView list() {

        ModelAndView model = new ModelAndView("apartmandaire_list");
        List<Apartmandaire> apartmandaireList = apartmandaireService. getAllApartmandaire();
        model.addObject("apartmandaireList", apartmandaireList);

        return model;
    }



    @RequestMapping(value="/addApartmandaire/", method=RequestMethod.GET)
    public ModelAndView addApartmandaire() {

        ModelAndView model = new ModelAndView();
        Apartmandaire apartmandaire = new Apartmandaire();
        model.addObject("apartmandaireForm", apartmandaire);
        model.setViewName("apartmandaire_form");

        return model;
    }



    @RequestMapping(value="/editApartmandaire/{id}", method=RequestMethod.GET)
    public ModelAndView editApartmandaire(@PathVariable int id) {
        ModelAndView model = new ModelAndView();

        Apartmandaire apartmandaire = apartmandaireService.getApartmandaireById(id);
        model.addObject("apartmandaireForm", apartmandaire);
        model.setViewName("apartmandaire_form");

        return model;
    }

    @RequestMapping(value="/addApartmandaire", method=RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("apartmandaireForm") Apartmandaire apartmandaire) {

        apartmandaireService.addApartmandaire(apartmandaire);
        return new ModelAndView("redirect:/apartmandaire/list");

    }

    @RequestMapping(value="/deleteApartmandaire/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id) {

        apartmandaireService.deleteApartmandaire(id);
        return new ModelAndView("redirect:/apartmandaire/list");

    }



}