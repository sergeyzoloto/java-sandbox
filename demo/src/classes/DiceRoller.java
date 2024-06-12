package classes;

import java.util.Random;

public class DiceRoller {
    Random random;

    // int number as global variable
    int number;
    
    DiceRoller() {
        // int number = 0; // local variable
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}