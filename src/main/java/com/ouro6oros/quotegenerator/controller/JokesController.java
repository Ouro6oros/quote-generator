package com.ouro6oros.quotegenerator.controller;

import com.ouro6oros.quotegenerator.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    QuoteService quoteService;

    public JokesController(@Autowired QuoteService quoteService) {
        this.quoteService = quoteService;
    }
}
