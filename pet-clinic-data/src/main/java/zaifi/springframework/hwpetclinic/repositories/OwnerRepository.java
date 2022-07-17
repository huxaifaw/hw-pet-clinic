package zaifi.springframework.hwpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zaifi.springframework.hwpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
