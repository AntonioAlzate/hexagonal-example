package co.com.sofka.hexagonal.domain.ports.persistence;

import co.com.sofka.hexagonal.domain.models.Person;

import java.util.stream.Stream;

public interface PersonPersistence {

    Person update(Person person);

    Stream<Person> findById(String id);

    Stream<Person> findAll();
}
