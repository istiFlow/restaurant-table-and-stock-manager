package hu.restaurant.Restaurant.Repository;

import hu.restaurant.Restaurant.Entity.RestaurantTables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTablesRepository extends JpaRepository<RestaurantTables,Long> {
}
