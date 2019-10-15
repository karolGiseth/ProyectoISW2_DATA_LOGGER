package co.com.edu.uan.proyecto.proyectoisw2.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.com.edu.uan.proyecto.proyectoisw2.entity.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
 
 User findByEmail(String email);
}
