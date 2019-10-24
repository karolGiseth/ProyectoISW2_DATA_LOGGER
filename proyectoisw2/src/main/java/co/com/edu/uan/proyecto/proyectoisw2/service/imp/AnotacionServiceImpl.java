package co.com.edu.uan.proyecto.proyectoisw2.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.com.edu.uan.proyecto.proyectoisw2.daos.AnotacionDao;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Anotacion;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.AnotacionServiceAPI;

import co.com.edu.uan.proyecto.proyectoisw2.util.APIservicesIMPL;

/**
 * 
 * @author Karol,
 *  esta clase debe heredar de los servicios que implementa el servicio
 *se usa la abstracción concreta de la APIservice.class
 */
@Service
public class AnotacionServiceImpl extends APIservicesIMPL<Anotacion, Long> implements AnotacionServiceAPI {

	
	@Autowired
	private AnotacionDao anotacion;
	
	@Override
	public CrudRepository<Anotacion, Long> getDao() {

		return anotacion;
	}

}
