package hu.restaurant.Restaurant.Service;

import hu.restaurant.Restaurant.Entity.User;
import hu.restaurant.Restaurant.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class UserService {

    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
