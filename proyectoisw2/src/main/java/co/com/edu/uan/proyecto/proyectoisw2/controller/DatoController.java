package co.com.edu.uan.proyecto.proyectoisw2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Dato;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.DatoService;


/**
 * 
 * @author Karol:
 * clase que maneja el controlador de la clase dato, para esto se usa MVC de SPRINGBOOT
 *
 */
//@Controller
public class DatoController {

	@Autowired
	private DatoService datoService;
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("list", datoService.getAll());
		return "index";
	}
	
	
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("dato", datoService.get(id));
		}else {
			model.addAttribute("dato", new Dato());
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Dato dato, Model model) {
		datoService.save(dato);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		datoService.delete(id);
		
		return "redirect:/";
	}
	
}
