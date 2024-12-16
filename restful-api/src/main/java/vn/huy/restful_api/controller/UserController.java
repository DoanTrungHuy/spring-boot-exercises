package vn.huy.restful_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Min;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vn.huy.restful_api.controller.request.UserCreationRequest;
import vn.huy.restful_api.controller.request.UserPasswordRequest;
import vn.huy.restful_api.controller.request.UserUpdateRequest;
import vn.huy.restful_api.controller.response.UserResponse;

import java.util.*;

@RestController
@RequestMapping("/user")
@Tag(name = "User Controller")
public class UserController {
    @Operation(summary = "Get user list", description = "API retrieve user from DB")
    @GetMapping("/list")
    public Map<String, Object> getAllUsers(@RequestParam(required = false) String keyword,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "20") int size) {

        UserResponse user1 = new UserResponse();
        UserResponse user2 = new UserResponse();

        user1.setId(1L);
        user1.setUsername("admin");
        user1.setFirstName("Trung");
        user1.setLastName("Huy");
        user1.setGender("Male");
        user1.setDateOfBirth(new Date());
        user1.setUsername("admin");
        user1.setEmail("admin@gmail.com");
        user1.setPhone("0916728393");

        user2.setId(2L);
        user2.setFirstName("Dung");
        user2.setLastName("Code");
        user2.setGender("Male");
        user2.setDateOfBirth(new Date());
        user2.setUsername("user");
        user2.setEmail("user@gmail.com");
        user2.setPhone("0916728391");

        List<UserResponse> userList = List.of(user1, user2);

        Map<String, Object> result = new LinkedHashMap<>();

        result.put("status", HttpStatus.OK.value());
        result.put("message", "user list");
        result.put("data", userList);

        return result;
    }

    @Operation(summary = "Get user detail", description = "API retrieve user from DB by ID")
    @GetMapping("/{userId}")
    public Map<String, Object> getUserDetail(@PathVariable Long userId) {

        UserResponse userDetail = new UserResponse();

        userDetail.setId(1L);
        userDetail.setUsername("admin");
        userDetail.setFirstName("Trung");
        userDetail.setLastName("Huy");
        userDetail.setGender("Male");
        userDetail.setDateOfBirth(new Date());
        userDetail.setUsername("admin");
        userDetail.setEmail("admin@gmail.com");
        userDetail.setPhone("0916728393");

        Map<String, Object> result = new LinkedHashMap<>();

        result.put("status", HttpStatus.OK.value());
        result.put("message", "user");
        result.put("data", userDetail);

        return result;
    }

    @Operation(summary = "Create User", description = "API add new user to DB")
    @PostMapping("/add")
    public Map<String, Object> createUser(UserCreationRequest request) {
        Map<String, Object> result = new LinkedHashMap<>();

        result.put("status", HttpStatus.CREATED.value());
        result.put("message", "User created successfully");
        result.put("data", 3);

        return result;
    }

    @Operation(summary = "Update User", description = "API update user to DB")
    @PutMapping("/upd")
    public Map<String, Object> updateUser(UserUpdateRequest request) {
        Map<String, Object> result = new LinkedHashMap<>();

        result.put("status", HttpStatus.ACCEPTED.value());
        result.put("message", "User updated successfully");
        result.put("data", "");

        return result;
    }

    @Operation(summary = "Change Password", description = "API change password for user to DB")
    @PatchMapping("/change-pwd")
    public Map<String, Object> changePassword(UserPasswordRequest request) {
        Map<String, Object> result = new LinkedHashMap<>();

        result.put("status", HttpStatus.NO_CONTENT.value());
        result.put("message", "Password updated successfully");
        result.put("data", "");

        return result;
    }

    @Operation(summary = "Delete User", description = "API delete user from DB")
    @DeleteMapping("/del/{userId}")
    public Map<String, Object> deleteUser(@PathVariable Long userId) {
        Map<String, Object> result = new LinkedHashMap<>();

        result.put("status", HttpStatus.RESET_CONTENT.value());
        result.put("message", "User deleted successfully");
        result.put("data", "");

        return result;
    }
}