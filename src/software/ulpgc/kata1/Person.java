package software.ulpgc.kata1;

import java.util.Objects;

import static java.lang.String.valueOf;

public class Person {
    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String initials() {
        return (valueOf(name.charAt(0)) + valueOf(surname.charAt(0)));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
