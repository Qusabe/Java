import java.util.Scanner;
public class Three {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = -1, count = 0;
        while (n > i)
        {
            i = scan.nextInt();
            i *= i;
            count += 1;;
        }
        System.out.println(count + " " + i);
    }
}
