package pl.najavie.cookbook.functions;

import pl.najavie.cookbook.models.Person;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by krzysztof on 1/3/15.
 */
public class PersonNumberConsumer implements Consumer<Person>  {

    public static final PersonNumberConsumer INSTANCE = new PersonNumberConsumer();
    private PersonNumberConsumer() {

    }

    @Override
    public void accept(Person person) {
        person.setNumbers(IntStream.generate(IntegerSupplier.INSTANCE).limit(10).boxed().collect(Collectors.toList()));
    }
}
