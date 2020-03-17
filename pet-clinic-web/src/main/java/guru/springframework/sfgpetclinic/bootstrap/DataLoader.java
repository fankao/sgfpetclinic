package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner ow1 = new Owner();
        ow1.setFirstName("John");
        ow1.setLastName("Thomson");

        ownerService.save(ow1);


        Owner ow2 = new Owner();
        ow2.setFirstName("Sam");
        ow2.setLastName("Tony");

        ownerService.save(ow2);

        System.out.println("Loaded owner...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Wild");
        vet1.setLastName("John");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lily");
        vet2.setLastName("Aun");

        vetService.save(vet2);

        System.out.println("Loaded vet...");





    }
}
