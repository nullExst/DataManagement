import java.util.*;

public class diceGame {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        Random rand = new Random();
        System.out.println("Rolling dice...");
        for (int i = 1; i <= 2; i++) {
            int dice = rand.nextInt(6) + 1;
            System.out.println("Dice " + i + ": " + dice);
            sum += dice;
        }
        System.out.println("Total value: " + sum);
    }
}