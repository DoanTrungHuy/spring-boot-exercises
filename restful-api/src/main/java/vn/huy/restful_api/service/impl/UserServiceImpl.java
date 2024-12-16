package vn.huy.restful_api.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vn.huy.restful_api.controller.request.UserCreationRequest;
import vn.huy.restful_api.controller.request.UserPasswordRequest;
import vn.huy.restful_api.controller.request.UserUpdateRequest;
import vn.huy.restful_api.controller.response.UserResponse;
import vn.huy.restful_api.service.UserService;

import java.util.List;

@Service
@Slf4j(topic = "USER-SERVICE")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public List<UserResponse> findAll() {
        return List.of();
    }

    @Override
    public UserResponse findById(Long id) {
        return null;
    }

    @Override
    public UserResponse findByUsername(String username) {
        return null;
    }

    @Override
    public UserResponse findByEmail(String email) {
        return null;
    }

    @Override
    public int save(UserCreationRequest req) {
        return 0;
    }

    @Override
    public void update(UserUpdateRequest req) {

    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public void changePassword(UserPasswordRequest req) {

    }
}
