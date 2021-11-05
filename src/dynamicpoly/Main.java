package dynamicpoly;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Voicable> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        for (Voicable animal : animals) {
            animal.voice();
            System.out.println();
        }
    }
}
