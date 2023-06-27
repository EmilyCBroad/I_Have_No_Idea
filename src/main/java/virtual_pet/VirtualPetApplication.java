package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        Scanner scanner = new Scanner(System.in);

        VirtualPet francois = new VirtualPet("Francois");

        System.out.println("Welcome! This is Virtual Pet. Lets introduce you to your new pet, this is " + francois.getName());

        scanner.close();
    }

}
