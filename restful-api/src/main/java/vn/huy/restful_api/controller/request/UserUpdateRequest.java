package vn.huy.restful_api.controller.request;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class UserUpdateRequest implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String username;
    private String email;
    private String phone;
}
