package zaifi.springframework.hwpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zaifi.springframework.hwpetclinic.model.Owner;
import zaifi.springframework.hwpetclinic.model.Vet;
import zaifi.springframework.hwpetclinic.services.OwnerService;
import zaifi.springframework.hwpetclinic.services.VetService;
import zaifi.springframework.hwpetclinic.services.map.OwnerServiceMap;
import zaifi.springframework.hwpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Robert");
        owner1.setLastName("Michael");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Geneva");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessica");
        vet2.setLastName("Potter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}