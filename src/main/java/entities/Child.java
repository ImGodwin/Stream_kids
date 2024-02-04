package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "child_table")
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

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()*/


}
