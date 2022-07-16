package zaifi.springframework.hwpetclinic.services.map;

import org.springframework.stereotype.Service;
import zaifi.springframework.hwpetclinic.model.Specialty;
import zaifi.springframework.hwpetclinic.services.SpecialtyService;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {
    @Override
    public void delete(Specialty t) {
        super.delete(t);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return super.save(specialty);
    }
}
