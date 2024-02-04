package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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


    @CreationTimestamp
    private Date createdAt;

}
