import org.junit.jupiter.api.*;

public class AdderTest {

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

    //testar metoden Add
    @Test
    void testAdd () {
        Adder testObject = new Adder(); // test code
        int a = - 5;
        int b = 3;
        int actual = testObject.add(a, b); //CUT
        int expected = - 1;
        Assertions.assertEquals(expected, actual); //Assertions
    }
}
