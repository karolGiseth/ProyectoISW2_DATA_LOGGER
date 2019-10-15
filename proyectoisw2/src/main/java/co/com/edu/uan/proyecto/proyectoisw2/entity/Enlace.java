package co.com.edu.uan.proyecto.proyectoisw2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Enlace extends Dato{

	@Column
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
