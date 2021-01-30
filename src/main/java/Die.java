import java.util.*;

public class Die {
    private int sides;
    private int value;

    //Constructor
    public Die (int s) {
        sides = s;
    }

    //metod att rolla och value sätts här (som setter)
    public void roll() {
        Random rollrand = new Random();
        value = rollrand.nextInt(sides)+1;
    }

    //metod att få vilket värde man får efter kastet (getter)
    public int getValue() {
        return value;
    }

}
