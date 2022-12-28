package spring.dao;

import spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Role getByName(String roleName);
}
