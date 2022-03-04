package co.com.sofka.hexagonal.domain.ports.services;

import co.com.sofka.hexagonal.domain.models.Person;

import java.util.stream.Stream;

public interface PersonService {

    Stream<Person> findAll();

    // TODO: todos los servicios restantes
}
