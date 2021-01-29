import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DieTest {
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

    @ParameterizedTest
    @ValueSource(ints = {4,6,8,10,12,20,100})
    void testDie(int input){
        Die testDie = new Die(input); //test code
        Boolean actual = false;
        testDie.roll(); //CUT
        if(testDie.getValue() <= input){
            actual = true;
        }
        Assertions.assertTrue(actual);
    }

}

