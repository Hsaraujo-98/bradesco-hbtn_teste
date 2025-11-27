
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private Person person;

    @BeforeEach
    public void setup() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date birthDate = cal.getTime();

        person = new Person("Paul", "McCartney", birthDate, true, true, true, 1200);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        assertEquals(14400, person.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        // Ajustar atributos para ser MEI
        person.setSalary(1000);
        // Tornar elegível
        person = new Person("Paul", "McCartney", new Date(2000 - 1900, Calendar.JANUARY, 1),
                false, false, false, 1000);
        assertTrue(person.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        // Mantém atributos iniciais que não permitem MEI
        assertFalse(person.isMEI());
    }
}
