package spring.service;

import java.util.Optional;
import spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
