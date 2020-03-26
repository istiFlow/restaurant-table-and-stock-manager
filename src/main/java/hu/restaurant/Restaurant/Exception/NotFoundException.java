package hu.restaurant.Restaurant.Exception;

import javassist.NotFoundException;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(Long id) {
        super("user");


    }

}
