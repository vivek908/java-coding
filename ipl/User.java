package ipl;

import java.util.List;

public class User {
    String name;
    String email;
    List<String> bookingHistroy;
    public User(String name, String email, List<String> bookingHistroy) {
        this.name = name;
        this.email = email;
        this.bookingHistroy = bookingHistroy;
    }
    
}
