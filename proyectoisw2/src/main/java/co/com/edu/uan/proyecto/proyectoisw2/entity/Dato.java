package co.com.edu.uan.proyecto.proyectoisw2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * 
 * @author Karol
 *Clase entidad que representa en el diagrama de clases la clase Dato
 */
@Entity 
public class Dato {

	@Id //indicas que esto es el ID del atributo de la tabla en la bd
	@GeneratedValue(strategy = GenerationType.IDENTITY) //se indica que el valor que llege acá, sea generado automaticamente por JPA en la base de datos
	private Long id;
	@Column //se indica que este atributo es una columna (atributo de tabla) en la bd
	private String titulo;
	
	@ManyToOne
	private Categoria categoria;
	
	@ManyToOne
	private Cliente cliente;
	
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
	
	
	
}
