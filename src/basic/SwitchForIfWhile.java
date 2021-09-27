package basic;

public class SwitchForIfWhile {
    public static void main(String[] args) {
        int age = 13;
        String human;

        if (age == 3 || age == 4 || age == 5 || age == 6)
            human = "little child";
        else if (age == 7 || age == 8 || age == 9 || age == 10 || age == 11)
            human = "kid";
        else if (age == 12 || age == 13 || age == 14 || age == 15 || age == 16)
            human = "teenager";
        else
            human = "unidentified";
        System.out.println("He is a " + human);

        String  i = "1";
        switch (i) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("work day");
                break;
            case "6":
            case "7":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("default");
        }
        int j = 0;
        while (j < 10) {
            j++;
            System.out.println("hi");
//            "hi" will be written 10times
        }

        int k = 100;
        int r = 200;
        while (++k < --r);
        System.out.println("k = " + k);
//        Will 150, an average number

        int m = 0;
        for (int l = 0; l <= 100 ; l++) {
            if (j%2==0){
                System.out.println(l);
            }
//            all numbers (0,2,4,6....100). If j%2!=0 - 1,3,4....99
        }
    }
}
