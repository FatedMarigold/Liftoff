package com.example.MVP.controllers;

import com.example.MVP.models.data.CategoryRepository;
import com.example.MVP.models.data.RecordRepository;
import com.example.MVP.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private RecordRepository recordRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("")
    public String home(Model model) {
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("records", recordRepository.findAll());
        model.addAttribute("categories", categoryRepository.findAll());

        return "home";
    }
}
