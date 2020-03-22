package hu.restaurant.Restaurant.Repository;

import hu.restaurant.Restaurant.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
