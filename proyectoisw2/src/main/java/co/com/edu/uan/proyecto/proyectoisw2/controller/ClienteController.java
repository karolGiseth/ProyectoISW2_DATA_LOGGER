package co.com.edu.uan.proyecto.proyectoisw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Cliente;
import co.com.edu.uan.proyecto.proyectoisw2.entity.Dato;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.ClienteService;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.DatoService;


/**
 * 
 * @author Karol
 * Controlador de la clase cliente, en el modelo
 *
 */
//@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	/**
	 * 
	 * @param model 
	 * @return
	 */
	@RequestMapping("/paginaCliente") 
	public String index(Model model) {
		model.addAttribute("list", clienteService.getAll());
		return "paginaCliente"; 
	}
	
	/**
	 * 
	 * @param id recibe un id para guardar los datos en un crud
	 * @param model añade al modelo los datos
	 * @return a la pagina a la que se redirija
	 */
	@GetMapping("/save/{id}")
	public String showSave(@PathVariable("id") Long id , Model model) {
		if(id != null && id != 0) {
			model.addAttribute("cliente", clienteService.get(id));
		}else {
			model.addAttribute("cliente", new Cliente());
		}
		return "save";
	}
	
	/**
	 * 
	 * @param dato pasa el valor del objeto dato al modelo
	 * @param model carga el modelo en la vista
	 * @return redirije a la página raíz
	 */
	@PostMapping("/save")
	public String save(Cliente cliente, Model model) {
		clienteService.save(cliente);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id, Model model) {
		clienteService.delete(id);
		
		return "redirect:/";
	}
	
}
