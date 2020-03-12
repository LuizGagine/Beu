package br.edu.ifsp.spo.a6pgp.barriga.beu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeUController {
	
	@GetMapping("/teste")
	public String getMap() {
		return "BATEU";
	}

}
