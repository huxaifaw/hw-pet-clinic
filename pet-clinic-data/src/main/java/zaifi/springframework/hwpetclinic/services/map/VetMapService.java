package zaifi.springframework.hwpetclinic.services.map;

import org.springframework.stereotype.Service;
import zaifi.springframework.hwpetclinic.model.Specialty;
import zaifi.springframework.hwpetclinic.model.Vet;
import zaifi.springframework.hwpetclinic.services.SpecialtyService;
import zaifi.springframework.hwpetclinic.services.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if (object != null) {
            if (object.getSpecialties() != null && object.getSpecialties().size() > 0) {
                object.getSpecialties().forEach(specialty -> {
                    if (specialty.getId() == null) {
                        Specialty savedSpecialty = specialtyService.save(specialty);
                        specialty.setId(savedSpecialty.getId());
                    }
                });
            }
            return super.save(object);
        }
        return null;
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
