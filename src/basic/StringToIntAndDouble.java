package basic;

public class StringToIntAndDouble {
    public static void main(String[] args) {
        final String s = "123";
        final String s1 = "12.3";
        int x; double y;
        x = Integer.parseInt(s);
        y = Double.parseDouble(s1);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println(s1);
        System.out.println(s);
        // make int and double from String
    }

}
