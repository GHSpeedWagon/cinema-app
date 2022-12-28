package spring.service;

import spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
