package co.com.edu.uan.proyecto.proyectoisw2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends User {

	@OneToMany(mappedBy = "cliente")
	private List<Dato> dato = new ArrayList<Dato>();

	public List<Dato> getDato() {
		return dato;
	}

	public void setDato(List<Dato> dato) {
		this.dato = dato;
	}

}
