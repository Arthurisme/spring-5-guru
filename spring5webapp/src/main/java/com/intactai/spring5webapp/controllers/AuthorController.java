package com.intactai.spring5webapp.controllers;


import com.intactai.spring5webapp.repositories.AuthorRepository;
import com.intactai.spring5webapp.repositories.BookRepository;
import com.intactai.spring5webapp.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {


    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;


    public AuthorController(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }



    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
