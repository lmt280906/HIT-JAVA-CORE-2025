package Buoi5.Baitaptrenlop;

import java.util.ArrayList;

public class Cage {
    private String cageCode;
    public ArrayList<Pet> pets;
    private int currentPetCount;
    public static int totalCages;
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode) {
        this.cageCode = cageCode;
        this.pets = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages++;
    }
    public void addPet(Pet pet){
        if (currentPetCount < MAX_CAPACITY) {
            pets.add(pet);
            currentPetCount++;
        } else {
            System.out.println("Chuong " + cageCode + " day ");
        }
    }
    public void printAllPets(){
        System.out.println("Chuong " + cageCode + " gom:");
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }
    }




