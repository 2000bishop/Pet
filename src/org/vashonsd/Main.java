package org.vashonsd;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Pet firstPet = new Pet(Pet.TypeOfAnimal.Chicken);
        firstPet.setDateOfBirth(LocalDate.of(2008, 8,21));
        System.out.println(firstPet.getAge());
    }
}
