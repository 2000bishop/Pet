package org.vashonsd;

import java.time.LocalDate;

public class Pet {

    int dayOfBirth;
    String breed;
    String name;
    int age;
    LocalDate dateOfBirth;
    TypeOfAnimal typeOfAnimal;
    boolean needsRestraint;

    public enum TypeOfAnimal {
        Dog,
        Cat,
        Chicken
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Pet(TypeOfAnimal typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int yearsApart = now.getYear() - dateOfBirth.getYear();
        if(now.getMonthValue() < dateOfBirth.getMonthValue()) {
            yearsApart -= 1;
        }
        return yearsApart;
    }

    public void setRestrant(boolean needsRestrant) {

        this.needsRestraint = needsRestraint;
    }

    public boolean needsRestrant(boolean isIt){
        if (age >= 13){
            return true;

        }
        return isIt;
    }

}
