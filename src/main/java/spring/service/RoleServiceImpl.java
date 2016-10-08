package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.dao.RoleDAO;
import spring.model.Role;

/**
 *  Created by sinan on 07/08/2015.
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDAO roleDAO;

    public Role getRole(int id) {
        return roleDAO.getRole(id);
    }

}
