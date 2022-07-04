package zaifi.springframework.hwpetclinic.services;

import zaifi.springframework.hwpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
