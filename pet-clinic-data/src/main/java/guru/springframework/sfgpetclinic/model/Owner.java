package guru.springframework.sfgpetclinic.model;

import jdk.packager.internal.ModuleManager;

import java.util.Set;

public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
