package co.com.edu.uan.proyecto.proyectoisw2.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import co.com.edu.uan.proyecto.proyectoisw2.daos.DatoDAO;
import co.com.edu.uan.proyecto.proyectoisw2.entity.Dato;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.DatoService;


/**
 * 
 * @author Karol:
 * clase que maneja el controlador de la clase dato, para esto se usa MVC de SPRINGBOOT
 *
 */
@Controller
@RequestMapping("/crudDato")
public class DatoController {
 
    @Autowired
    private DatoDAO datoDao;
 
    @RequestMapping(value="", method = RequestMethod.GET)
    public String listaDatos(ModelMap mp){
        mp.put("datos", datoDao.findAll());
        return "crudDato/lista";
    }
 
    @RequestMapping(value="/nuevo", method=RequestMethod.GET)
    public String nuevo(ModelMap mp){
        mp.put("dato", new Dato());
        return "crudDato/nuevo";
    }
 
    @RequestMapping(value="/crear", method=RequestMethod.POST)
    public String crear(@Valid Dato dato,
            BindingResult bindingResult, ModelMap mp){
        if(bindingResult.hasErrors()){
            return "/crudDato/nuevo";
        }else{
            datoDao.save(dato);
            mp.put("dato", dato);
            return "crudDato/creado";
        }
    }
 
    @RequestMapping(value="/creado", method = RequestMethod.POST)
    public String creado(@RequestParam("dato") Dato dato){
        return "/crudDato/creado";
    }
 
}
