import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KorvmojjTest {

    // test av konstruktor
    @Test
    void testKorvmojj (){
        Korvmojj testMojj = new Korvmojj(); //test code
        Assertions.assertEquals(5,testMojj.amountOfSausagesLeft); //CUT, Assertions
    }
}
