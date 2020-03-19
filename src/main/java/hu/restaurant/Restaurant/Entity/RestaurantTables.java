package hu.restaurant.Restaurant.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tables")
public class RestaurantTables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String tableName;

    private Integer seats;

    @Column
    private Boolean occupied;

   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "restaurantTables")
    @JsonIgnore
    private List<User> users;*/

}
