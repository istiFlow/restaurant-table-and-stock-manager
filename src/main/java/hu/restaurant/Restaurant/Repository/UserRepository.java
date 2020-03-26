package hu.restaurant.Restaurant.Repository;

import hu.restaurant.Restaurant.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Modifying
    void deleteByIdIn(List<Long> id);
}
