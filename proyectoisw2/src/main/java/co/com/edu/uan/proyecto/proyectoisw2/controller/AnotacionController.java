package co.com.edu.uan.proyecto.proyectoisw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Anotacion;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.AnotacionServiceAPI;

@Controller
public class AnotacionController {
	

	
	@Autowired
	private AnotacionServiceAPI anotacionServiceAPI;
	
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("list", anotacionServiceAPI.getAll());
		return "index";
	}
	

	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("anotacion", anotacionServiceAPI.get(id));
		}else {
			model.addAttribute("anotacion", new Anotacion());
		}
		return "save";
	}
	

	@PostMapping("/save")
	public String save(Anotacion catalogo, Model model) {
		anotacionServiceAPI.save(catalogo);
		return "redirect:/index";
	}
	
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		anotacionServiceAPI.delete(id);
		
		return "redirect:/index";
	}
	
	
	
}