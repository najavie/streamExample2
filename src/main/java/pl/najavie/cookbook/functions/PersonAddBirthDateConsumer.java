package pl.najavie.cookbook.functions;

import org.apache.commons.lang.math.RandomUtils;
import pl.najavie.cookbook.models.Person;

import java.util.Date;
import java.util.function.Consumer;

/**
 * Created by krzysztof on 1/3/15.
 */
public class PersonAddBirthDateConsumer implements Consumer<Person> {

    public static final PersonAddBirthDateConsumer INSTANCE = new PersonAddBirthDateConsumer();

    private PersonAddBirthDateConsumer() {

    }

    @Override
    public void accept(Person person) {
        person.setBirthdate(new Date(RandomUtils.nextLong()));
    }
}
