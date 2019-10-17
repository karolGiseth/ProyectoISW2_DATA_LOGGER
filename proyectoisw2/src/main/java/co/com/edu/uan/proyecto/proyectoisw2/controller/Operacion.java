package co.com.edu.uan.proyecto.proyectoisw2.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.data.repository.CrudRepository;

import co.com.edu.uan.proyecto.proyectoisw2.entity.Anotacion;
import co.com.edu.uan.proyecto.proyectoisw2.service.api.AnotacionService;
import co.com.edu.uan.proyecto.proyectoisw2.service.imp.AnotacionServiceImp;
import co.com.edu.uan.proyecto.proyectoisw2.util.APIservice;
import co.com.edu.uan.proyecto.proyectoisw2.util.APIservicesIMPL;

public class Operacion {

	static Anotacion anotacion = new Anotacion();
	static APIservice anotacionService;
	
	public static void main(String[] args) {
		anotacion.setId(2L);
		anotacion.setCategoria("Deportivos");
		anotacion.setDescripcion("vehiculo 4 puertas");
		anotacion.setTitulo("Vehiculos");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Anotacion.class);
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();


	    SessionFactory sf = con.buildSessionFactory(sr);


		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		session.save(anotacion);
		
	}
	
}
