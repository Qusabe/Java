import java.util.Scanner;
public class Six {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        double diskr = Math.pow(b, 2) - 4 * a * c;
        if (diskr > 0)
            System.out.println(2);
        if (diskr < 0)
            System.out.println(0);
        if (diskr == 0)
            System.out.println(1);
    }
}
