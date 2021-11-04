package relationship;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human personOne;
        Human personTwo;

        System.out.println("Enter first person data separated by spaces: sex (true for male, false for female), name, surname, height, weight");
        Scanner scanner = new Scanner(System.in);
        String person1Data = scanner.nextLine();
        String [] person1 = person1Data.split(" ");

        boolean person1Sex = Boolean.parseBoolean(person1[0]);
        String person1Name = person1[1];
        String person1Surname = person1[2];
        float person1Height = Float.parseFloat(person1[3]);
        float person1Weight = Float.parseFloat(person1[3]);

        if (person1Sex)
            personOne = new Male(person1Name, person1Surname, person1Height, person1Weight);
        else
            personOne = new Female(person1Name, person1Surname, person1Height, person1Weight);

        System.out.println();

        System.out.println("Enter second person data separated by spaces: sex (true for male, false for female), name, surname, height, weight");
        scanner = new Scanner(System.in);
        String person2Data = scanner.nextLine();
        String [] person2 = person2Data.split(" ");

        boolean person2Sex = Boolean.parseBoolean(person2[0]);
        String person2Name = person2[1];
        String person2Surname = person2[2];
        float person2Height = Float.parseFloat(person2[3]);
        float person2Weight = Float.parseFloat(person2[3]);

        if (person2Sex)
            personTwo = new Male(person2Name, person2Surname, person2Height, person2Weight);
        else
            personTwo = new Female(person2Name, person2Surname, person2Height, person2Weight);

        System.out.println();
        System.out.println("Talking test 1, first person talks to the second one");
        System.out.println(personOne.talkTo(personTwo));
        System.out.println("Talking test 2, second person talks to the first one");
        System.out.println(personTwo.talkTo(personOne));
        System.out.println();

        System.out.println("Tolerate company test 1");
        System.out.println(personOne.tolerateCompany(personTwo));
        System.out.println("Tolerate company test 2");
        System.out.println(personTwo.tolerateCompany(personOne));
        System.out.println();

        System.out.println("Spend time together test 1");
        System.out.println(personOne.spendTimeTogether(personTwo));
        System.out.println("Spend time together test 2");
        System.out.println(personTwo.spendTimeTogether(personOne));
        System.out.println();

        System.out.println("Have relationship test");
        Human potentialChild = personOne.haveRelationship(personTwo);

        if (potentialChild != null) {

            if (potentialChild.sex)
                System.out.println("Congrats, you have a boy!");
            else
                System.out.println("Congrats, you have a girl!");

            System.out.println("Enter child's name: ");
            potentialChild.setName(scanner.nextLine());

            System.out.println("Here is child info");
            System.out.println(potentialChild);
        } else
            System.out.println("Sorry, no relationship is possible");



//        Male vasya = new Male("Vasya", "Kovalenko", 1.8f, 80f);
//        Male jon = new Male("Jon", "Smith", 1.85f, 90f);
//        Female kate = new Female("Kete", "Johnson", 1.7f, 55f);
//        Female masha = new Female("Masha", "Sydorenko", 1.66f, 49f);
//
//        System.out.println("Spend time together test");
//        System.out.println();
//        System.out.println(vasya.spendTimeTogether(jon));
//        System.out.println(jon.spendTimeTogether(vasya));
//
//        System.out.println(kate.spendTimeTogether(masha));
//        System.out.println(masha.spendTimeTogether(kate));
//
//        System.out.println(vasya.spendTimeTogether(kate));
//        System.out.println(jon.spendTimeTogether(masha));
//
//        System.out.println(kate.spendTimeTogether(jon));
//        System.out.println(masha.spendTimeTogether(vasya));
//
//        System.out.println();
//
//        System.out.println("Talking test");
//        System.out.println();
//        System.out.println(vasya.toTalk(kate));
//        System.out.println(masha.toTalk(jon));
//        System.out.println();
//
//        System.out.println("Have relationship test");
//        System.out.println();
//
//        System.out.println(vasya.haveRelationship(jon, "Garry"));
//        System.out.println(kate.haveRelationship(masha, "Garry"));
//
//        System.out.println(masha.haveRelationship(jon, "Denis"));
//        System.out.println(vasya.haveRelationship(kate, "Denis"));
//    }
}}
