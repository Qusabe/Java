import java.util.Scanner;
public class Fout {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        var ast = "*";
        var repeated = "p";
        while (i <= n)
        {
            repeated = ast.repeat(i);
            i += 1;
            System.out.println(repeated);
        }
    }
}
