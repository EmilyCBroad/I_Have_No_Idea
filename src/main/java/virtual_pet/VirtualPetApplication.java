package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        // Interact with a VirtualPet object in this method

        Scanner scanner = new Scanner(System.in);

        int choice;

        VirtualPet pet = new VirtualPet("Francois");

        System.out
                .println("Welcome! This is Virtual Pet. Lets introduce you to your new pet, this is " + pet.getName() + ". As you can see, they are VERY hungry and thirsty but are happy and look healthy!");
        System.out.println("Hunger Level: " + pet.getHunger());
        System.out.println("Thirst Level: " + pet.getThirst());
        System.out.println("Happiness Level: " + pet.getHappiness());
        System.out.println("Sickness level: " + pet.getSickness());

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Feed " + pet.getName());
            System.out.println("2. Give " + pet.getName() + " water");
            System.out.println("3. Play with " + pet.getName());
            System.out.println("4. Take " + pet.getName() + " to the vet");
            System.out.println("5. Surrender " + pet.getName() + " to pet sanctuary");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You fed Francois!");
                pet.feed();
            } else if (choice == 2) {
                System.out.println("You gave Francois water!");
                pet.water();
            } else if (choice == 3) {
                System.out.println("You and Francois played with their favorite toy!");
                pet.play();
            } else if (choice == 4) {
                System.out.println("You notice Francois isn't feeling well, so you take them to the vet.");
                pet.takeToVet();
            }

            pet.tick();

            System.out.println("Hunger Level: " + pet.getHunger());
            System.out.println("Thirst Level: " + pet.getThirst());
            System.out.println("Happiness Level: " + pet.getHappiness());
            System.out.println("Sickness level: " + pet.getSickness());

        } while (choice != 5);

        scanner.close();
    }
}
