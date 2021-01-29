import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPerson(){
        Person testPerson = new Person("Maria","Shishkina",23,true);
        String expected = "Shishkina";
        testPerson.setLastName("Blabla"); //CUT
        Assertions.assertEquals(expected, testPerson.getLastName());
        }
}

