package vn.huy.restful_api.controller.request;

import lombok.Getter;
import lombok.Setter;
import vn.huy.restful_api.common.UserType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserCreationRequest implements Serializable {
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String username;
    private String email;
    private String phone;
    private UserType type;
    private List<AddressRequest> addresses;

    public String getFirstName() {
        return firstName;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<AddressRequest> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressRequest> addresses) {
        this.addresses = addresses;
    }
}
