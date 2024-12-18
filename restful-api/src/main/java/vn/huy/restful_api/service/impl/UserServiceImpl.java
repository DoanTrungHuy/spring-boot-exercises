package vn.huy.restful_api.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.huy.restful_api.common.UserStatus;
import vn.huy.restful_api.controller.request.AddressRequest;
import vn.huy.restful_api.controller.request.UserCreationRequest;
import vn.huy.restful_api.controller.request.UserPasswordRequest;
import vn.huy.restful_api.controller.request.UserUpdateRequest;
import vn.huy.restful_api.controller.response.UserResponse;
import vn.huy.restful_api.model.AddressEntity;
import vn.huy.restful_api.model.UserEntity;
import vn.huy.restful_api.repository.AddressRepository;
import vn.huy.restful_api.repository.UserRepository;
import vn.huy.restful_api.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private AddressRepository addressRepository;
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

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
    @Transactional(rollbackFor = Exception.class)
    public long save(UserCreationRequest req) {
        log.info("Saving user: {}", req);
        UserEntity user = new UserEntity();
        user.setFirstName(req.getFirstName());
        user.setLastName(req.getLastName());
        user.setGender(req.getGender());
        user.setDateOfBirth(req.getDateOfBirth());
        user.setEmail(req.getEmail());
        user.setPhone(req.getPhone());
        user.setUsername(req.getUsername());
        user.setType(req.getType());
        user.setStatus(UserStatus.NONE);
        userRepository.save(user);

        if (user.getId() != null) {
            List<AddressEntity> addresses = new ArrayList<>();
            req.getAddresses().forEach((AddressRequest address) -> {
                AddressEntity addressEntity = new AddressEntity();
                addressEntity.setApartmentNumber(address.getApartmentNumber());
                addressEntity.setFloor(address.getFloor());
                addressEntity.setBuilding(address.getBuilding());
                addressEntity.setStreetNumber(addressEntity.getStreetNumber());
                addressEntity.setStreet(addressEntity.getStreet());
                addressEntity.setCountry(addressEntity.getCountry());
                addressEntity.setAddressType(addressEntity.getAddressType());
                addresses.add(addressEntity);
            });
            addressRepository.saveAll(addresses);
            log.info("Saved addresses: {}", addresses);
        }

        return user.getId() == null ? 0 : user.getId();
    }

    @Override
    public void update(UserUpdateRequest req) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void changePassword(UserPasswordRequest req) {

    }
}
