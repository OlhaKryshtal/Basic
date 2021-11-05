package relationship;

import java.util.Random;

public class Male extends Human {
    public Male(String name, String surname, float height, float weight) {
        super(true, name, surname, height, weight);
    }

    public Male(String surname, float height, float weight) {
        this("Incognito", surname, height, weight);
    }

    @Override
    public boolean talkTo(Human anotherHuman) {
        if (anotherHuman instanceof Female)
            return true;
        else
            return new Random().nextInt(100) < 50;
    }

    @Override
    public boolean tolerateCompany(Human anotherHuman) {
        if (anotherHuman instanceof Female)
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
            return ((Female)anotherHuman).bornChild(this);

        return null;
    }
}
