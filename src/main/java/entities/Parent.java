package entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
public class Parent {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String occupation;
    private String nationality;
    private long telephone;
    private String address;
    private String email;
    private String password;


}
