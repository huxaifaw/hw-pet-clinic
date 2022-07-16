package zaifi.springframework.hwpetclinic.services.map;

import org.springframework.stereotype.Service;
import zaifi.springframework.hwpetclinic.model.PetType;
import zaifi.springframework.hwpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public void delete(PetType t) {
        super.delete(t);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }
}
