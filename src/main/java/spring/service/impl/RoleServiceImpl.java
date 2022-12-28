package spring.service.impl;

import org.springframework.stereotype.Service;
import spring.dao.RoleDao;
import spring.model.Role;
import spring.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName);
    }
}
