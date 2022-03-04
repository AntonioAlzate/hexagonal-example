package co.com.sofka.hexagonal.infrastructure.rest.person;

import co.com.sofka.hexagonal.domain.ports.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class PersonResource {

    private PersonService personService;

    @Autowired
    public PersonResource(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public Stream<BasicPersonDto> findAll(){
        return personService.findAll()
                .map(person -> new BasicPersonDto(person.getName()));
    }
}
