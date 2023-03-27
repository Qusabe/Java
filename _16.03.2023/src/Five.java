import java.util.Scanner;
public class Five {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), i = 1, cache = n;
        var pr = " ";
        var ast = "*";
        int count = 1;
        var repeated = "p";
        var rep_2 = "m";
        while (count <= n)
        {
            repeated = pr.repeat(cache);
            rep_2 = ast.repeat(i);
            cache--;
            i += 2;
            count++;
            System.out.println(repeated + rep_2);
        }
    }
}
