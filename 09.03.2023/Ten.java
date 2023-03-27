import java.util.Scanner;
public class Ten {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int first = x/10;
        int second = x % 10;
        String f_lat = "", s_lat = "";
        if (first == 1)

        System.out.println(first + second);
    }
}
