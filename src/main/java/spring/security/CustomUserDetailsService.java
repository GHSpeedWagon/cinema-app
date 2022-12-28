package spring.security;

import static org.springframework.security.core.userdetails.User.withUsername;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import spring.model.User;
import spring.service.UserService;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    private UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByEmail(username).orElseThrow(
                () -> new UsernameNotFoundException("User not found")
        );
        UserBuilder builder;
        builder = withUsername(username);
        builder.password(user.getPassword());
        builder.roles(user.getRoles()
                .stream()
                .map(f -> f.getRoleName().name())
                .toArray(String[]::new));
        return builder.build();
    }
}
