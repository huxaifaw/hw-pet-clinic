package zaifi.springframework.hwpetclinic.services;

import zaifi.springframework.hwpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
