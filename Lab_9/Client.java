import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Creature creature = new Creature();
        System.out.println("Name: " + creature.getName());
        System.out.println("Description: " + creature.getDescription());
        System.out.println("Endurance: " + creature.getEndurance());

        String fileName = creature.getFileName();

        System.out.println("Phrases:");
        for (int i = 0; i < 3; i++) {
            System.out.println("- " + creature.getPhrase());
        }

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter new phrase " + (i + 1) + ": ");
            String newPhrase = scanner.nextLine();
            creature.changePhrase(i, newPhrase);
        }

        System.out.println("Phrases:");
        for (int i = 0; i < 4; i++) {
            System.out.println("- " + creature.getPhrase());
        }

        while (!creature.isTired()) {
            creature.setEndurance(creature.getEndurance() - 1);
        }

        creature.setEndurance(20);

        System.out.println("Response: " + creature.reactToBehavior("Some behavior"));

        System.out.print("Enter a new name: ");
        creature.setName(scanner.nextLine());;
        creature.saveAsToFile("creature.dat");

        creature.saveAsToFile(fileName);

        Creature newCreature = new Creature("creature.dat");
        System.out.println(newCreature.toString());
    }
}
