package co.com.sofka.hexagonal.infrastructure.mongodb.persistence;

import co.com.sofka.hexagonal.domain.models.Person;
import co.com.sofka.hexagonal.domain.ports.persistence.PersonPersistence;
import co.com.sofka.hexagonal.infrastructure.mongodb.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Stream;

public class PersonPersistenceMongodb implements PersonPersistence {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person update(Person person) {
        return null; // TODO
    }

    @Override
    public Stream<Person> findById(String id) {
        return null; // TODO
    }

    @Override
    public Stream<Person> findAll() {
        return null; // TODO
    }
}
