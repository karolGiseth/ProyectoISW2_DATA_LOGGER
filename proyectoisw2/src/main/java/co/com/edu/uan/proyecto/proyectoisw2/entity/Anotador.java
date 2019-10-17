package co.com.edu.uan.proyecto.proyectoisw2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import co.com.edu.uan.proyecto.proyectoisw2.util.IAnotar;


public class Anotador extends User{

	
	private IAnotar anotar;

	public IAnotar getAnotar() {
		return anotar;
	}

	public void setAnotar(IAnotar anotar) {
		this.anotar = anotar;
	}
	
}
