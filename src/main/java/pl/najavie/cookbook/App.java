package pl.najavie.cookbook;


import org.apache.commons.lang.math.RandomUtils;
import pl.najavie.cookbook.functions.*;
import pl.najavie.cookbook.models.Person;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //stworzmy generator osób...
        Stream<Person> personStream = Stream.generate(PersonSupplier.INSTANCE);

        //wezmy z niego troche ludzi...
        List<Person> persons = personStream.limit(100).collect(Collectors.toList());

        //do kilku dodajmy daty urodzin... bo genetor jest wredny i nam ich nie utworzył ;)
        //napisałem taki mały predykat, który wybiera jakieś osoby badając hashcode... i nastepnie funkcja, ktora dodaje jakas randomowa date..
        persons.stream().filter(HashCodeEvenPredicate.INSTANCE).forEach(PersonAddBirthDateConsumer.INSTANCE);

        //Igor, pokaż mi daty!
        persons.stream().filter(person -> person.getBirthdate() != null).forEach(person -> System.out.println(person.toString()));

        //a teraz pobierzmy wszystkie daty
        List<Date> dates = persons.stream().map(person -> person.getBirthdate()).collect(Collectors.toList());

        //hmm.. sa wsrod nich tez nulle... pozbede sie ich teraz!
        List<Date> datesWithoutNulls = dates.stream().filter(NotNullPredicate.INSTANCE).collect(Collectors.toList());

        //a moze jakas metoda co doda do osoby jakies numerki? :)
        persons.parallelStream().forEach(PersonNumberConsumer.INSTANCE);

        //jaka jest suma numerków każdej osoby?
        persons.parallelStream().map(person -> person.getNumbers()).map(Add.INSTANCE).forEach(number -> System.out.println(number));

        //a jaka jest suma wszystkich numerków? można to zrobić na co najmniej dwa sposoby
        Integer result1 = persons.parallelStream().flatMap(person -> person.getNumbers().parallelStream()).reduce(AddAccumulate.INSTANCE).get();
        Integer result2 = persons.parallelStream().map(person-> person.getNumbers()).map(Add.INSTANCE).reduce(AddAccumulate.INSTANCE).get();












    }
}
