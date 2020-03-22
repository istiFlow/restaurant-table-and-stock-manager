package hu.restaurant.Restaurant.Repository;

import hu.restaurant.Restaurant.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
