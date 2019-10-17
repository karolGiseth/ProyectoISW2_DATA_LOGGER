package co.com.edu.uan.proyecto.proyectoisw2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Anotacion;
import co.com.edu.uan.proyecto.proyectoisw2.entity.Dato;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.AnotacionService;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.DatoService;


/**
 * 
 * @author Karol:
 * clase que maneja el controlador de la clase dato, para esto se usa MVC de SPRINGBOOT
 *
 */
//@Controller
public class AnotacionController {

	@Autowired
	private AnotacionService anotacionService;
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("list", anotacionService.getAll());
		return "index";
	}
	
	
	@GetMapping("/saveDato/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("anotacion", anotacionService.get(id));
		}else {
			model.addAttribute("anotacion", new Anotacion());
		}
		return "saveDato";
	}
	
	@PostMapping("/saveDato")
	public String save(Anotacion anotacion, Model model) {
		anotacionService.save(anotacion);
		return "redirect:/index";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		anotacionService.delete(id);
		
		return "redirect:/index";
	}


	
}
