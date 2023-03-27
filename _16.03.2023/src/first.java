import java.util.Scanner;
public class first {
    public static void main(String[] args)
    {
       int sum = 0;
       Scanner scan = new Scanner(System.in);
       int i = -1;
       while (i != 0)
        {
            i = scan.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}