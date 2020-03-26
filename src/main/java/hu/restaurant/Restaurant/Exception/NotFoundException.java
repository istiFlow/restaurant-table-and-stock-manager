package hu.restaurant.Restaurant.Exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String msg) {
        super("missing: " + msg);
    }

}
