package zaifi.springframework.hwpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zaifi.springframework.hwpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
