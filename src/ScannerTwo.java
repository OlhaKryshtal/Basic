import java.util.Scanner;

public class ScannerTwo {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String twoR = one.next();
        System.out.println(twoR);
        System.out.println(twoR + "  it is the name of String");

        Scanner two = new Scanner(System.in);
        String twoK = two.next();
        System.out.println(twoK);
        System.out.println(twoK + " it is an another String");
    }
}
