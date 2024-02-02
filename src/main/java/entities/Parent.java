package entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

public class Parent {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String email;


}
