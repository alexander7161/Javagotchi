/**
 * Created by k1761218 on 30/10/17.
 */
public class Creature {
    int energy;
    int fullness;
    int happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;

    }

    public void eat() {
        if(fullness >= 12) print(this.getName() + "is already full.");
        else {
            fullness += 8;
            happiness-= 6;
            energy -= 4;
            if (fullness > 15) {fullness = 15; }
            print(this.getName() + "Enjoyed that");
        }
    }

    public void sleep() {
            energy += 8;
            happiness-= 6;
            fullness -= 4;
            if (energy > 15) {energy = 15; }

        print("That was a good nap");

    }

    public void play() {
            happiness += 8;
            fullness-= 6;
            energy -= 4;
            if (happiness > 15) {happiness = 15; }
        print("That was fun");
    }

    public String checkStatus() {
        if(happiness <= 0 || energy <= 0 || fullness <= 0) {
            print(this.getName() + " has died.");
            System.exit(0);
        }

        String status = "";
        if (happiness<=6) status += this.getName() + "is feeling sad!";
        if (energy <= 6) status += this.getName() + "is really tired";
        if (fullness <= 6) status += this.getName() + "is very hungry";


        return status;
    }

    public String getName() {
    return name;
    }

    public void print(String s) {
        System.out.println(s);
    }

}
