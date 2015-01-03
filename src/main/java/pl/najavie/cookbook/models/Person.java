package pl.najavie.cookbook.models;

import java.util.Date;
import java.util.List;

/**
 * Created by krzysztof on 1/3/15.
 */
public class Person {
    private String name;
    private String lastName;
    private Date birthdate;
    private List<Integer> numbers;

    public Person(String name, String lastName, Date birthdate, List<Integer> numbers) {
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", numbers=" + numbers +
                "}\n";
    }
}
