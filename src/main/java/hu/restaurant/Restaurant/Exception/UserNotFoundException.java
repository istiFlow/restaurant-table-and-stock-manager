package hu.restaurant.Restaurant.Exception;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(Long id) {
        super("user");
    }

}
