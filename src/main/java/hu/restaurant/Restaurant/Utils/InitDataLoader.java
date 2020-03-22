package hu.restaurant.Restaurant.Utils;

import hu.restaurant.Restaurant.Entity.User;
import hu.restaurant.Restaurant.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Component
@Transactional
@AllArgsConstructor
public class InitDataLoader {

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.save(User.builder()
                .id(1L)
                .firstName("Károly")
                .lastName("Dobó")
                .email("dkaresz@gmail.com")
                .loginDate(LocalDateTime.of(2020,3,2,10,0).toInstant(ZoneOffset.UTC).toEpochMilli())
                .role("USER")
                .build());
    }
}
