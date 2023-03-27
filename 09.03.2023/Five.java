import java.util.Scanner;
public class Five {
    public static void main (String[] args)
    {
//        Не решено
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble();
        double x = -1*(b/a);
        double diskr = Math.pow(a,2);
        System.out.println(diskr);
    }
}
