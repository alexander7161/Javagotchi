/**
 * Created by k1761218 on 30/10/17.
 */
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Creature creature;
     public boolean userQuits = false;
    public void run() {
        boolean userQuits = false;
        startTutorial();
        while(!userQuits) {
            interact();
            System.out.println(this.creature.checkStatus());
        }
        System.out.println("Time to put the creature to sleep");
    }
    public void startTutorial() {
        System.out.println("Welcome to Javagotchi!");
        System.out.println("What is your creature called?");

        String name = scanner.nextLine();

        this.creature = new Creature(name);

        System.out.println("Say hello to " + this.creature.getName() + "!");
    }
    private void interact() {
        System.out.println("What would you like to do?");
        System.out.println("1. Play");
        System.out.println("2. Eat");
        System.out.println("3. Sleep");
        System.out.println("4. Quit");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                creature.play();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.sleep();
                break;
            case 4:
                userQuits = true;
                break;
            default:
                System.out.println("Print a number between 1 and 4.");
                break;
        }

    }


}
