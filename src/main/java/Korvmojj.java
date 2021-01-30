public class Korvmojj {
    public int amountOfSausagesLeft;

    //Constructor
    public Korvmojj() {
        this(5);
    }

    //Constructor 2
    public Korvmojj(int korv) {
        this.amountOfSausagesLeft = korv;
    }

    //metod att att kolla om det finns korv kvar då ger man den till en person. Antalet korvar minskar då.
    //här finns både setter och getter
    public void feedSausageToPerson(Person p) {
        if((p.getHungryStatus()) && (amountOfSausagesLeft > -1)) {
            amountOfSausagesLeft--;
            p.setHungryStatus(false);
        }else {
            System.out.println("Sorry");
        }
    }
}
