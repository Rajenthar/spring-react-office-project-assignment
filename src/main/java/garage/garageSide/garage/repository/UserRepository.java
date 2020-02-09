package garage.garageSide.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import garage.garageSide.garage.entity.User;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    @Query(value = "SELECT * FROM Users u WHERE u.name = (:username) and u.password = (:password)", nativeQuery = true)
    User userLoginCheck(@Param("username") String username, @Param("password") String password);


    @Query(value = "SELECT * FROM Users u WHERE u.name = (:username)", nativeQuery = true)
    User usernameAvailabilityCheck(@Param("username") String username);

    @Query(value = "SELECT * FROM Users u WHERE u.name = (:username)", nativeQuery = true)
    User findByUsername(@Param("username") String username);
}

