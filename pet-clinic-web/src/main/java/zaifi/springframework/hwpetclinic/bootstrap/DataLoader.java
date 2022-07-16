package zaifi.springframework.hwpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import zaifi.springframework.hwpetclinic.model.Owner;
import zaifi.springframework.hwpetclinic.model.Pet;
import zaifi.springframework.hwpetclinic.model.PetType;
import zaifi.springframework.hwpetclinic.model.Vet;
import zaifi.springframework.hwpetclinic.services.OwnerService;
import zaifi.springframework.hwpetclinic.services.PetTypeService;
import zaifi.springframework.hwpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType parrot = new PetType();
        parrot.setName("Parrot");
        PetType savedParrotPetType = petTypeService.save(parrot);

        Owner owner1 = new Owner();
        owner1.setFirstName("Robert");
        owner1.setLastName("Michael");
        owner1.setAddress("123 Brick");
        owner1.setCity("Miami");
        owner1.setTelephone("123456789");

        Pet owner1Pet1 = new Pet();
        owner1Pet1.setPetType(savedDogPetType);
        owner1Pet1.setOwner(owner1);
        owner1Pet1.setName("Rosco");
        owner1Pet1.setBirthDate(LocalDate.now());
        owner1.getPets().add(owner1Pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Geneva");
        owner1.setAddress("123 Brick");
        owner1.setCity("Miami");
        owner1.setTelephone("123456789");

        Pet owner2Pet1 = new Pet();
        owner2Pet1.setPetType(savedCatPetType);
        owner2Pet1.setOwner(owner2);
        owner2Pet1.setName("Shadow");
        owner2Pet1.setBirthDate(LocalDate.now());
        owner2.getPets().add(owner2Pet1);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessica");
        vet2.setLastName("Potter");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
