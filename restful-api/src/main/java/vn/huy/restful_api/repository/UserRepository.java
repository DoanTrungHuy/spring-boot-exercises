package vn.huy.restful_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.huy.restful_api.model.AddressEntity;
import vn.huy.restful_api.model.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
