package de.space.burger.services;

import de.space.burger.models.User;

import java.util.List;

/**
 * 8/23/2023
 * Introduction
 *
 * @author Marsel Sidikov (AIT TR)
 */
public interface UsersService {
    User addUser(String email, String password);

    List<User> getAllUsers();

    void updateUser(Long id, String newEmail, String newPassword);
}
