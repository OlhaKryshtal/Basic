package com.it;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        final String next = scanner.nextLine();

        System.out.println("Oh, Hi " + next);

    }

}