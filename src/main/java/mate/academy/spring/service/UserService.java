package mate.academy.spring.service;

import java.util.Optional;
import mate.academy.spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
