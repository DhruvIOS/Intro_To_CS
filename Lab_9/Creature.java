import java.io.*;
import java.util.Scanner;

public class Creature {
    private String name;
    private String description;
    private int endurance;
    private String filename;
    private String[] phrases;
    private int lastPhraseUsedIndex;

    public Creature() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter description: ");
        description = scanner.nextLine();

        System.out.print("Enter endurance: ");
        endurance = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter filename: ");
        filename = scanner.nextLine();

        phrases = new String[3];
        for (int i = 0; i < phrases.length; i++) {
            System.out.print("Enter phrase " + (i + 1) + ": ");
            phrases[i] = scanner.nextLine();
        }

        lastPhraseUsedIndex = 0;
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(name + "\n");
            writer.write(description + "\n");
            writer.write(endurance + "\n");
            writer.write(phrases.length + "\n");
            for (String phrase : phrases) {
                writer.write(phrase + "\n");
            }
            writer.write(lastPhraseUsedIndex + "\n");
            writer.close();
            System.out.println("Creature saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving creature to file: " + e.getMessage());
        }
    }

    public void saveToFile(String newFilename) {
        filename = newFilename;
        saveToFile();
    }

    public Creature(String filename) {
        this.filename = filename;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            name = scanner.nextLine();
            description = scanner.nextLine();
            endurance = scanner.nextInt();
            scanner.nextLine();
            int numPhrases = scanner.nextInt();
            scanner.nextLine();
            phrases = new String[numPhrases];
            for (int i = 0; i < numPhrases; i++) {
                phrases[i] = scanner.nextLine();
            }
            lastPhraseUsedIndex = scanner.nextInt();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error loading creature from file: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public void setEndurance(int newEndurance) {
        if (newEndurance >= 0) {
            endurance = newEndurance;
            if (endurance == 0) {
                System.out.println("The creature is tired.");
            }
        } else {
            endurance = 0;
        }
    }

    public boolean isTired() {
        return endurance <= 0;
    }

    public String getPhrase() {
        int index = (lastPhraseUsedIndex + 1) % phrases.length;
        lastPhraseUsedIndex = index;
        return phrases[index];
    }

    public void changePhrase(int index, String newPhrase) {
        phrases[index] = newPhrase;
        lastPhraseUsedIndex = index;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\n");
        sb.append("Description: ").append(description).append("\n");
        sb.append("Endurance: ").append(endurance).append("\n");
        sb.append("Phrases:\n");
        for (String phrase : phrases) {
            sb.append("- ").append(phrase).append("\n");
        }
        sb.append("Last Phrase Used Index: ").append(lastPhraseUsedIndex).append("\n");
        return sb.toString();
    }

    public String reactToBehavior(String behavior) {
        // Custom method to handle the behavior and return a reaction
        // Add your own logic here
        return "The creature reacts to the behavior by doing something.";
    }
}
