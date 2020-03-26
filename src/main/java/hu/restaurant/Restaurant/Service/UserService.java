package hu.restaurant.Restaurant.Service;

import hu.restaurant.Restaurant.Entity.User;
import hu.restaurant.Restaurant.Exception.UserNotFoundException;
import hu.restaurant.Restaurant.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class UserService {

    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findOne(Long id) {
        return Optional.of(userRepository.findById(id))
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User updateUserDetails(Long id, User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteMoreUsers(List<Long> id) {
        userRepository.deleteByIdIn(id);
    }

}
