package co.com.edu.uan.proyecto.proyectoisw2.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import co.com.edu.uan.proyecto.proyectoisw2.daos.CategoriaDAOapi;
import co.com.edu.uan.proyecto.proyectoisw2.daos.DatoDAOapi;
import co.com.edu.uan.proyecto.proyectoisw2.entity.Categoria;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.CategoriaService;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.DatoService;
import co.com.edu.uan.proyecto.proyectoisw2.util.APIservicesIMPL;

/**
 * 
 * @author Karol,
 *  esta clase debe heredar de los servicios que implementa el servicio
 *se usa la abstracción concreta de la APIservice.class
 */
public class CategoriaServiceImp extends APIservicesIMPL<Categoria, Long> implements CategoriaService{

	
	/**
	 * se inyecta la dependencia datoDAOapi que nos facilita usar los metodos de la interfaz en sus clase concretas
	 */
	@Autowired
	private CategoriaDAOapi categoriaDAO;
		
	/**
	 * @param las operaciones de crudrepository tomaran la forma de la interfaz dato dao
	 */
	@Override
	public CrudRepository<Categoria, Long> getDao() {
		// TODO Auto-generated method stub
		return categoriaDAO; 
	}

}
