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
            if (current == 0) {
                min = 0;
                max = 0;
            }

            if (min > current) min = current;
            if (max < current) max = current;
        }
        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max); // Choosing the biggest and the smallest number.
    }
}

class NumbersDivides {
    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        ArrayList<Integer> division = new ArrayList<>();
        ArrayList<Integer> division2 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            if ((number % 3 == 0) || (number % 9 == 0)) division.add(number);
            if ((number % 5 == 0) && (number % 7 == 0)) division2.add(number);

        }
        System.out.println("Numbers which divides on 3 or 9 : " + division);
        System.out.println("Numbers which divides on 5 and 7 : " + division2);
    }
}

class NumbersResult {
    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        ArrayList<Integer> result3 = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);

            int hundreds = number / 100;
            int decades = (number % 100) / 10;
            int ones = number % 10;

            if (hundreds != decades && hundreds != ones && decades != ones) result3.add(number);
        }
        System.out.println(result3); /// All digits in numbers are different
    }
}

class HappyNumbers {
    public static void main(String[] args) {
        System.out.println("Input your numbers");
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        ArrayList<Integer> happyNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);

            int a = number / 100_000;
            int b = (number % 100_000) / 10_000;
            int c = (number % 10_000) / 1000;
            int d = (number % 1000) / 100;
            int e = (number % 100) / 10;
            int f = number % 10;

            int sum123 = a + b + c;
            int sum456 = d + e + f;

            if (sum123 == sum456) happyNumbers.add(number);

        }
        System.out.println("happy numbers : " + happyNumbers); //
    }
}