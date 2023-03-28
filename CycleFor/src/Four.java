import java.util.Scanner;
public class Four {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt(), sum = 0;
        for (int i = 0; i < amount; i++)
        {
            scan.next();
            int age = scan.nextInt();
            sum += age;
        }
        System.out.println(sum/amount);
    }
}
