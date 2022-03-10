package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.duranco.model.Examen;

@RestController
public class MainController {
@GetMapping("")
public ModelAndView accueil()
{
ModelAndView mo=new ModelAndView("form.html");
return mo;
}
@PostMapping("calculer")
public String calcule(@RequestParam int id,String matiere,double examen,double tp)
{
Examen ex=new Examen(id, matiere, examen, tp);	
return ex.toString();
}
}
