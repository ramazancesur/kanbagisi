package spring.service;

import spring.model.User;

/**
 *  Created by sinan on 07/08/2015.
 */
public interface UserService {
    public User getUser(String login);
}
