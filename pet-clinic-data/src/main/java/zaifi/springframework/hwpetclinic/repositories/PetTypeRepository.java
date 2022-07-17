package zaifi.springframework.hwpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zaifi.springframework.hwpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
