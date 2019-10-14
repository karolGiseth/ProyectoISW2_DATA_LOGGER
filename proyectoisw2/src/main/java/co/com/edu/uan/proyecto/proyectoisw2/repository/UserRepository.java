package co.com.edu.uan.proyecto.proyectoisw2.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.com.edu.uan.proyecto.proyectoisw2.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    public Optional<User> findByUsername(String username);

}
