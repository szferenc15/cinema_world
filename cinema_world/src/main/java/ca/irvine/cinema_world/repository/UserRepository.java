package ca.irvine.cinema_world.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import ca.irvine.cinema_world.model.User;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Integer>{
    Optional<User> findByUsername(String username);
}