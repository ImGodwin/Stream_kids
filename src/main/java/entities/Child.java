package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Child {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String surname;
    private String favoriteColor;
    private String favoriteCartoonCharacter;
    private String nickName;
    private int age;
    private String guardianEmail;

    @CreationTimestamp
    private Date createdAt;



}
