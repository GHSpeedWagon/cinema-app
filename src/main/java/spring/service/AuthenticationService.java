package spring.service;

import spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
