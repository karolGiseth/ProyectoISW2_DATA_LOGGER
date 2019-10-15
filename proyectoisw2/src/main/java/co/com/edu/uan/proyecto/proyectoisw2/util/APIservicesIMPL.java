package co.com.edu.uan.proyecto.proyectoisw2.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class APIservicesIMPL<T, ID extends Serializable> implements APIservice<T, ID> {

	/**
	 * @param operacion para guardar los datos, en este caso recibe un objeto y se
	 *                  procede a guardar
	 */
	@Override
	public T save(T entity) {
		return getDao().save(entity);
	}

	
	/**
	 * @param operacion delete implementada de la interfaz que permite eliminar un
	 *                  objeto almacenado en la BD
	 */
	@Override
	public void delete(ID id) {
		getDao().deleteById(id);
	}

	/**
	 * @param operacion read (get) del CRUD se usa la clase Optional con generico T
	 *                  para encontrar un objeto por su id
	 */
	@Override
	public T get(ID id) {
		Optional<T> obj = getDao().findById(id);
		if (obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	/**
	 * @param operacion select all en sql pero se usa un foreach para cada elemento
	 *                  que retorne la lista de la operacion getDao(), en este caso
	 *                  se guarda en la lista para cada objeto que se use en ese for
	 *                  each
	 */
	@Override
	public List<T> getAll() {
		List<T> returnList = new ArrayList<>();
		getDao().findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}

	public abstract CrudRepository<T, ID> getDao();

}
