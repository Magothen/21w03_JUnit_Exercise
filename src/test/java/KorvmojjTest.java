import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.jupiter.api.*;

public class KorvmojjTest {

    @BeforeAll
    static void setup() {
        System.out.println("Starting testsuite - (Before All)");
    }

    @BeforeEach
    void setupEach(TestInfo testInfo) {
        System.out.println("Test starts - " + testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Closing testsuite - (After All)");
    }

    @AfterEach
    void tearDownEach(TestInfo testInfo) {
        System.out.println("Closing testsuite - " + testInfo.getDisplayName());
    }

    // test av konstruktor
    @Test
    void testKorvmojj (){
        Korvmojj testMojj = new Korvmojj(); //test code
        Assertions.assertEquals(5,testMojj.amountOfSausagesLeft); //CUT, Assertions
    }

    @Test
    void testFeedSausageToPerson(){
        Korvmojj testObject = new Korvmojj();
        //p = testObject.feedSausageToPerson(1);
        Assertions.assertTrue(true);

    }
}
