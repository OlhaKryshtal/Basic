package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Taskss {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        String name = one.next();
        System.out.println("Greetings, " + name + " !"); // Greetings of person

    }
}

class Arguments {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("Reverse arguments " + args[i]); // Writing the arguments in reverse.
    }
}

class RandomNumber {
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 100;
        int random = 0;

        for (int i = 0; i < 10; i++) {
            random = minNum + (int) (Math.random() * maxNum);
            System.out.println(random); // Random numbers in different lines
        }
    }
}

class Password {
    public static void main(String[] args) {
        String savedPassword = "1234";
        System.out.println("Write the Password");
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.next();

        if (inputPassword.equals(savedPassword))
            System.out.println("Your password is right");
        else
            System.out.println("Your password is wrong"); // Comparing passwords and writing of result
    }
}

class InputOutputNumbers {
    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int sum = 0;
        while (numbers != 0) {
            sum = sum + numbers % 10;
            numbers = numbers / 10;
        }
        System.out.println("Your quanity of numbers is " + sum); // Sum of numbers from console.
    }
}

class EvenOddNumbers {
    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            if (number % 2 == 0)
                even.add(number);
            else
                odd.add(number);
        }
        System.out.println("Even numbers : " + even);
        System.out.println("Odd numbers : " + odd); //Writing even and odd numbers
    }
}

class RankNumber {
    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        int min = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = Integer.parseInt(numbers[i]);
            if (min == 0) {
                min = current;
                max = current;
            }
            if (min > current) min = current;
            if (max < current) max = current;
        }
        System.out.println("Min number is "+min);
        System.out.println("Max number is "+max); // Choosing the biggest and the smallest number.
    }
}