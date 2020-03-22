package hu.restaurant.Restaurant.Repository;

import hu.restaurant.Restaurant.Entity.RestaurantTables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantTablesRepository extends JpaRepository<RestaurantTables,Long> {
}
