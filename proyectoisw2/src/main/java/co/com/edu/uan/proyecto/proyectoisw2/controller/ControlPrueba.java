package co.com.edu.uan.proyecto.proyectoisw2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class ControlPrueba {

	@RequestMapping("/InicioAnotador")
	public String miPrueba() {
		return "InicioAnotador";
	}
	
}
