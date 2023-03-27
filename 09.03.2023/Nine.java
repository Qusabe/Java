import java.util.Scanner;
public class Nine {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt(), minutes = scan.nextInt(), amount = scan.nextInt();
        int one_pan = minutes * 2;
        int pans = amount / max;
        if (amount % max != 0)
            pans++;
        int time = one_pan * pans;
        System.out.println(time);
    }
}
