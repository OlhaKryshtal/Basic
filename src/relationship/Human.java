package relationship;

import java.util.Random;

public abstract class Human {
    boolean sex;
    String name;
    String surname;
    float height;
    float weight;

    public Human(boolean sex, String name, String surname, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public abstract boolean talkTo(Human anotherHuman);

    public abstract boolean tolerateCompany(Human anotherHuman);

    public abstract Human haveRelationship(Human anotherHuman);

    public boolean spendTimeTogether(Human anotherHuman) {
        float heightDiff = Math.abs(this.height - anotherHuman.height);

        if (heightDiff > this.height * 0.1f || heightDiff > anotherHuman.height * 0.1f)
            return new Random().nextInt(100) < 85;
        else
            return new Random().nextInt(100) < 95;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

}
