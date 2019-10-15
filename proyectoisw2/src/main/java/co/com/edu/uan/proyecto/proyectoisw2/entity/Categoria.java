package co.com.edu.uan.proyecto.proyectoisw2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

	@Id
	private Long id;
	@Column
	private String titulo;
	
	@OneToMany(mappedBy="categoria")
	private List<Dato> dato = new ArrayList<Dato>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Dato> getDato() {
		return dato;
	}

	public void setDato(List<Dato> dato) {
		this.dato = dato;
	}
	
	
	
	
}
