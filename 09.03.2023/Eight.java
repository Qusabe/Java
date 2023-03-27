import java.util.Scanner;
public class Eight {
    public static void main (String[] args)
    {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
       if (Math.abs(a-c) == Math.abs(b - d))
           System.out.println("Yes");
       else
        System.out.println("NO");
    }
}
