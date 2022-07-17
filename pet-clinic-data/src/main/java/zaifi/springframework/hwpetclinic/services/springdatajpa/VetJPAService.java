package zaifi.springframework.hwpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import zaifi.springframework.hwpetclinic.model.Vet;
import zaifi.springframework.hwpetclinic.repositories.VetRepository;
import zaifi.springframework.hwpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJPA")
public class VetJPAService implements VetService {

    private final VetRepository vetRepository;

    public VetJPAService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
