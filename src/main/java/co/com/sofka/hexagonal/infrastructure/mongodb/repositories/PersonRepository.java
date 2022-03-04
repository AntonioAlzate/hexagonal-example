package co.com.sofka.hexagonal.infrastructure.mongodb.repositories;

import co.com.sofka.hexagonal.infrastructure.mongodb.entities.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<PersonEntity, String> {
}
