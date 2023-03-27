import java.util.Scanner;
public class Two {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x = scan.nextInt();
        int cache = x;
        while (x < n)
        {
            x += cache;
        }
        System.out.println(x);
    }
}
