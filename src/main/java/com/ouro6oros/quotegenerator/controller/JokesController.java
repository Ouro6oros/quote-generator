package com.ouro6oros.quotegenerator.controller;

import com.ouro6oros.quotegenerator.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private QuoteService quoteService;

    @Autowired
    public JokesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model){

        model.addAttribute("quote", quoteService.getQuote());

        return "chucknorris";


    }
}
