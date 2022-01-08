package one.digitalinnovation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRopository extends CrudRepository<Cliente, Long> {
}
