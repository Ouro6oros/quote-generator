package com.ouro6oros.quotegenerator.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteService implements QuoteService {

    ChuckNorrisQuotes quotes;

    public ChuckNorrisQuoteService() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
