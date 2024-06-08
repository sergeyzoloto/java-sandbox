import java.util.Random;

public class RandomClass {
  
  public static void main(String[] args) {
    // Math.random() generates a random number between 0 and 1
    System.out.println("This program generates a random number between 1 and 10.");
    int random = (int) (Math.random() * 10) + 1;
    System.out.println("The random number is " + random);
    
    // The Random class is a more powerful alternative to Math.random()
    Random rand = new Random();
    int random2 = rand.nextInt(10) + 1;
    System.out.println("The random number is " + random2);

    // Random can also generate random booleans
    boolean randomBoolean = rand.nextBoolean();
    System.out.println("The random boolean is " + randomBoolean);
  }
}
