package co.com.edu.uan.proyecto.proyectoisw2.daos;

import org.springframework.data.repository.CrudRepository;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Cliente;
import co.com.edu.uan.proyecto.proyectoisw2.entity.Dato;

public interface ClienteDAOapi extends CrudRepository<Cliente, Long>{

}
