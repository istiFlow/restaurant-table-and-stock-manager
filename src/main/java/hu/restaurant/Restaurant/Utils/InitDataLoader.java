package hu.restaurant.Restaurant.Utils;

import hu.restaurant.Restaurant.Entity.User;
import hu.restaurant.Restaurant.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.time.LocalDate;

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
                .username("karcsi61")
                .email("dkaresz@gmail.com")
                .loginDate(LocalDate.of(2000,5,20))
                .role("PINCÉR")
                .build());
        userRepository.save(User.builder()
                .id(2L)
                .firstName("István")
                .lastName("Kovács")
                .username("isti34")
                .email("isti@gmail.com")
                .loginDate(LocalDate.of(2000,5,20))
                .role("ADMIN")
                .build());
        userRepository.save(User.builder()
                .id(3L)
                .firstName("Gergő")
                .lastName("Nagy")
                .username("nagyG29")
                .email("geri@gmail.com")
                .loginDate(LocalDate.of(2000,5,20))
                .role("FŐNÖK")
                .build());
    }
}
