package com.example.crud.controller.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ui")
public class PersonaUiController {
	@GetMapping(path = "/persona")
	public String index() {
		return "persona/index";
	}
//
//	@GetMapping(path = "/agregar_persona")
//	public String agregar() {
//		return "persona/agregar";
//	}
}
