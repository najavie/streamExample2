package pl.najavie.cookbook.functions;

import junit.framework.TestCase;
import pl.najavie.cookbook.models.Person;

public class PersonAddBirthDateConsumerTest extends TestCase {

    public void testAccept() throws Exception {
        Person person = PersonSupplier.INSTANCE.get();
        PersonAddBirthDateConsumer.INSTANCE.accept(person);
        assertTrue(person.getBirthdate() != null);

    }
}