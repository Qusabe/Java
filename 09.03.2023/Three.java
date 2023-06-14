import java.util.Scanner;
public class Three {
    // "Большее из 3"
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        if (a > b)
            if (a > c)
                System.out.println(a);
        if (b > a)
            if (b > c)
                System.out.println(b);
        if (c > a)
            if (c > b)
                System.out.println(c);
    }
}
