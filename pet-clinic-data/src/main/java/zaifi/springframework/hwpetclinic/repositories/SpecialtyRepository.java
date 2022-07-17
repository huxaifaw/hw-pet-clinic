package zaifi.springframework.hwpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zaifi.springframework.hwpetclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
