package spring.service.impl;

import java.util.Set;
import org.springframework.stereotype.Service;
import spring.model.Role;
import spring.model.User;
import spring.service.AuthenticationService;
import spring.service.RoleService;
import spring.service.ShoppingCartService;
import spring.service.UserService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final RoleService roleService;
    private final ShoppingCartService shoppingCartService;

    public AuthenticationServiceImpl(UserService userService,
                                     RoleService roleService,
                                     ShoppingCartService shoppingCartService) {
        this.userService = userService;
        this.roleService = roleService;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        Role role = roleService.getByName(Role.RoleName.USER.name());
        user.setRoles(Set.of(role));
        user.setEmail(email);
        user.setPassword(password);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
