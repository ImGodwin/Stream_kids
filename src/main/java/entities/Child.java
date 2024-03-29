package entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Child {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;

}
