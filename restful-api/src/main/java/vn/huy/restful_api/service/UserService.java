package vn.huy.restful_api.service;

import vn.huy.restful_api.controller.request.UserCreationRequest;
import vn.huy.restful_api.controller.request.UserPasswordRequest;
import vn.huy.restful_api.controller.request.UserUpdateRequest;
import vn.huy.restful_api.controller.response.UserResponse;

import java.util.List;

public interface UserService {
    List<UserResponse> findAll();
    UserResponse findById(Long id);
    UserResponse findByUsername(String username);
    UserResponse findByEmail(String email);
    long save(UserCreationRequest req);
    void update(UserUpdateRequest req);
    void delete(Long id);
    void changePassword(UserPasswordRequest req);
}
