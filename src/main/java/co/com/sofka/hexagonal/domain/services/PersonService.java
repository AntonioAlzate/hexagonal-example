package co.com.sofka.hexagonal.domain.services;

import co.com.sofka.hexagonal.domain.models.Person;
import co.com.sofka.hexagonal.domain.ports.persistence.PersonPersistence;

import java.util.stream.Stream;

public class PersonService implements co.com.sofka.hexagonal.domain.ports.services.PersonService {

    @Override
    public Stream<Person> findAll() {
        return null; // TODO
    }
}
