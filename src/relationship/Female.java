package relationship;

import java.util.Random;

public class Female extends Human {

    public Female(String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    public Female(String surname, float height, float weight) {
        this("Incognito", surname, height, weight);
    }

    @Override
    public boolean talkTo(Human anotherHuman) {
        if (anotherHuman instanceof Male)
            return true;
        else
            return new Random().nextInt(100) < 50;
    }

    @Override
    public boolean tolerateCompany(Human anotherHuman) {
        if (anotherHuman instanceof Male)
            return true;
        else
            return new Random().nextInt(1000) < 56;
    }

    @Override
    public Human haveRelationship(Human anotherHuman) {
        if (this.talkTo(anotherHuman)
                && this.tolerateCompany(anotherHuman)
                && spendTimeTogether(anotherHuman)
                && this.sex != anotherHuman.sex)
            return bornChild((Male)anotherHuman);

        return null;
    }

    public Human bornChild(Male male) {
        float heightDifference = 0.1f * (male.height - this.height);
        float weightDifference = 0.1f * (male.weight - this.weight);

        if (new Random().nextInt(100) < 50) {
            float girlHeight = this.height + heightDifference;
            float girlWeight = this.weight + weightDifference;

            return new Female(male.surname, girlHeight, girlWeight);
        } else {
            float boyHeight = male.height + heightDifference;
            float boyWeight = male.weight + weightDifference;

            return new Male(male.surname, boyHeight, boyWeight);
        }
    }
}
