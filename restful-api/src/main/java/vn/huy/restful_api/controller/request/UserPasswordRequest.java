package vn.huy.restful_api.controller.request;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;

@Getter
public class UserPasswordRequest implements Serializable {
    private Long id;
    private String password;
    private String confirmPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
