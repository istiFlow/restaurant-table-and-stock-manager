package hu.restaurant.Restaurant.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, length = 50)
    private String username;

    @Transient
    @JsonIgnore
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true,length = 100)
    private String email;

    /*@Enumerated(EnumType.STRING)*/
    private String role;

    @Column
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate loginDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    @JsonIgnore
    private List<Order> orders;

    @ManyToMany
    private List<RestaurantTables> restaurantTables;

    // for oauth2
   /* @Transient
    @JsonIgnore
    @Override
    public String getName() {
        return username;
    }*/

}
