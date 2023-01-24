import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
 public class A_domino_piling {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("error");
        }
        int n, m;
        n = scn.nextInt();
        m = scn.nextInt();
        int a = n*m;
        a=a/2;
        System.out.println(a);
    } 
}