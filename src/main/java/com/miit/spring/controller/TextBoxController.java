package com.miit.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.miit.spring.model.PersonForm;

@Controller
public class TextBoxController {

  @GetMapping("/register")
  public String greetingForm(Model model) {
    model.addAttribute("greeting", new PersonForm());
    return "register";
  }

  @PostMapping("/register")
  public String greetingSubmit(@ModelAttribute PersonForm greeting, Model model) {
    model.addAttribute("greeting", greeting);
    return "success";
  }

}