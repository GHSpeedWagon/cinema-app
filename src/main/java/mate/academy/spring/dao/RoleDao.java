package mate.academy.spring.dao;

import mate.academy.spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Role getByName(String roleName);
}
