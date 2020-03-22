package hu.restaurant.Restaurant.Repository;

import hu.restaurant.Restaurant.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
