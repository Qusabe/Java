import java.util.Scanner;
public class Two {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), proizv = 1;
        for (int i = num; i > 0; i /= 10)
        {
            int digit = i % 10;
            proizv *= digit;
        }
        System.out.println(proizv);
    }
}
