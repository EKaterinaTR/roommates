package ru.itis.roommates.services;

import ru.itis.roommates.models.User;

public interface UserService {
    User getUserByEmail(String Email);
}
