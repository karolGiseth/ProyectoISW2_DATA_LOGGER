package co.com.edu.uan.proyecto.proyectoisw2.util;

import java.io.Serializable;
import java.util.List;

public interface APIservice<T, ID extends Serializable> {

	T save(T entity); //Operacion de guardar (create/update) en SQL
	void delete(ID id); //operacion eliminar (delete) de sql
	T get(ID id); //operacion get para traer los datos por un id (read en sql)
	List<T> getAll(); //operacion analoga a select * from <<una tabla>
	
}
