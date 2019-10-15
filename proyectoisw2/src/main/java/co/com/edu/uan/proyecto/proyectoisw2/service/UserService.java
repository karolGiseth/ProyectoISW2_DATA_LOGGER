package co.com.edu.uan.proyecto.proyectoisw2.service;

import co.com.edu.uan.proyecto.proyectoisw2.entity.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	 
}

