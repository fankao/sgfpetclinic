package guru.springframework.petclinic.bootstrap;

import guru.springframwork.sfgpetclinic.model.Owner;
import guru.springframwork.sfgpetclinic.model.Person;
import guru.springframwork.sfgpetclinic.model.Vet;
import guru.springframwork.sfgpetclinic.services.OwnerService;
import guru.springframwork.sfgpetclinic.services.VetService;
import guru.springframwork.sfgpetclinic.services.map.OwnerMapService;
import guru.springframwork.sfgpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner ow1 = new Owner();
        ow1.setId(1L);
        ow1.setFirstName("John");
        ow1.setLastName("Thomson");

        ownerService.save(ow1);


        Owner ow2 = new Owner();
        ow2.setId(2L);
        ow2.setFirstName("Sam");
        ow2.setLastName("Tony");

        ownerService.save(ow2);

        System.out.println("Loaded owner...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Wild");
        vet1.setLastName("John");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Lily");
        vet2.setLastName("Aun");

        vetService.save(vet2);

        System.out.println("Loaded vet...");





    }
}
