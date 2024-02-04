package entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "paren_table")
@JsonIgnoreProperties({"password"})
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

    @CreationTimestamp
    private Date createdAt;


}
