package zaifi.springframework.hwpetclinic.services.map;

import zaifi.springframework.hwpetclinic.model.Pet;
import zaifi.springframework.hwpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Long aLong, Pet pet) {
        return super.save(aLong, pet);
    }

    @Override
    public Pet save(Pet object) {
        super.save(object.getId(), object);
        return object;
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
