package co.com.sofka.hexagonal.infrastructure.rest.person;

public class BasicPersonDto {

    public BasicPersonDto() {
        // empty for framework
    }

    public BasicPersonDto(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BasicPersonDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
