package Buoi5.Baitaptrenlop;
 import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Cage cage1= new Cage("1");
        Cage cage2= new Cage("2");

        cage1.addPet(new Pet("Peter",15,"Bird"));
        cage1.addPet(new Pet("J97",99,"Cat"));
        cage1.addPet(new Pet("Viruss",10,"Dinasour"));
        cage1.addPet(new Pet("IShowSpeed",9,"Horse"));

        cage2.addPet(new Pet("Ben Eagle",10,"Eagle"));
        System.out.println("So long da tao la :"+Cage.totalCages);
        System.out.println("Danh sach thu :");
        cage1.printAllPets();
        cage2.printAllPets();
        System.out.println("So dong vat lon hon 10kg la : ");
        for(Pet pet : cage1.pets ){
            if(pet.isOverweight()){
               pet.printInfo();
            }
        }
        for(Pet pet1: cage2.pets){
            if(pet1.isOverweight()){
                pet1.printInfo();
            }
        }
    }
}
