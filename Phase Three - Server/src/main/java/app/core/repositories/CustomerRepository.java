package app.core.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import app.core.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findByEmailAndPassword(String email, String password);

	Optional<Customer> findByEmailIgnoreCase(String email);

	Customer getById(Long id);

}
