package zaifi.springframework.hwpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zaifi.springframework.hwpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
