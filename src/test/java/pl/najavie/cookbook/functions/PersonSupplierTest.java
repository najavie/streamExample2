package pl.najavie.cookbook.functions;

import junit.framework.TestCase;
import pl.najavie.cookbook.models.Person;

public class PersonSupplierTest extends TestCase {

    public void testGet() throws Exception {
        Person person = PersonSupplier.INSTANCE.get();
        assertTrue(person.getLastName() != null);
        assertTrue(person.getName() != null);
        assertTrue(person.getBirthdate() == null);
        assertTrue(person.getNumbers().isEmpty());
    }
}