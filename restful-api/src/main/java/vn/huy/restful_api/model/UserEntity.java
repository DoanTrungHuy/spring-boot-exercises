package vn.huy.restful_api.model;

import jakarta.validation.Valid;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tbl_user")
public class UserEntity {
    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String gender;

    private Date dateOfBirth;

    private String username;

    private String email;

    private String phone;

    private UserType type;

    private UsetStatus status;

    private Date createdAt;

    private Date updatedAt;
}
