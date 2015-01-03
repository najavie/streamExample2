package pl.najavie.cookbook.functions;

import com.google.common.collect.Lists;
import org.apache.commons.lang.RandomStringUtils;
import pl.najavie.cookbook.models.Person;

import java.util.function.Supplier;

/**
 * Function generating random person with name and lastName randomly generated.
 * Created by krzysztof on 1/3/15.
 */
public class PersonSupplier implements Supplier<Person> {

    public static final PersonSupplier INSTANCE = new PersonSupplier();

    private PersonSupplier() {

    }

    @Override
    public Person get() {
        return new Person(RandomStringUtils.randomAlphabetic(10),RandomStringUtils.randomAlphanumeric(10),null, Lists.newArrayList());
    }
}
