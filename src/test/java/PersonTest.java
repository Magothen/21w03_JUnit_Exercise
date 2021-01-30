import org.junit.jupiter.api.*;

public class PersonTest {

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

    //testa Constructor
    @Test
    void testConstructor(){
        Person testObject = new Person();
        Assertions.assertNull(null, testObject.getFirstName());
        Assertions.assertNull(null, testObject.getLastName());
        Assertions.assertEquals(true, testObject.getHungryStatus());
    }

    //testar getters och setter för firstname, lastname, age och hungry-boolean.
    //Fast age har aldrig använts i klassen (bara i toString)
    @Test
    void testPerson(){
        Person testPerson = new Person("M","S",23,true);
        String expected = "Shishkina";
        testPerson.setLastName("Shishkina"); //CUT
        String expected2 = "Maria";
        testPerson.setFirstName("Maria");
        testPerson.setHungryStatus(true);
        Assertions.assertEquals(expected, testPerson.getLastName());
        Assertions.assertEquals(expected2, testPerson.getFirstName());
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("testar metoden toString")
    void testToString(){
        Person testObject = new Person("Maria", "Shishkina", 25, true);
        Assertions.assertEquals("Maria Shishkina 25 true", testObject.toString());
    }
}

