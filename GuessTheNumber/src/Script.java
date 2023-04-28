import java.util.Scanner;
import java.lang.Math;
public class Script {
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            int number = (int) (Math.random() * 101);
            System.out.println("number == " + number);
            boolean flag = false;
            while (!flag) {

                System.out.println("Please, guess the number in the range from 0 to 100 inclusive");
                int guess = scan.nextInt();


                if ((guess < 0) | (guess > 100)) {
                    System.out.println("Incorrect number. Try again");
                    continue;
                }
                if (guess == number) {
                    System.out.println("You guessed! Congratulations!");
                    flag = true;
                }

                if (guess > number) {
                    System.out.println("It's too great.Try again.");
                    continue;
                }

                if (guess < number) {
                    System.out.println("It's too small.Try again.");
                }
            }

            System.out.println("Restart? 0 = No, 1 = Yes");
            boolean game = scan.hasNext();
            if (!game)
                flag = true;
                break;
        }
        System.out.println("Thanks for playing!");
    }
}