package zaifi.springframework.hwpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zaifi.springframework.hwpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
