package spring.dao;

import spring.model.User;

/**
 *  Created by sinan on 07/08/2015.
 */
public interface UserDAO {
    public User getUser(String login);
}
