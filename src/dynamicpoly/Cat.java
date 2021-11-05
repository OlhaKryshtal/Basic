package dynamicpoly;

public class Cat implements Voicable{
    @Override
    public void voice() {
        System.out.println("I am a cat, тварино! ");
        System.out.println("meow!");
    }

    public String getPissed(String command) {
        return String.format("%s, fuck me? Fuck you, lather man", command);
    }
}
