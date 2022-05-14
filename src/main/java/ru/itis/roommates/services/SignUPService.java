package ru.itis.roommates.services;

import ru.itis.roommates.DTO.UserDTO;
import ru.itis.roommates.models.User;

public interface SignUPService {
    User SignIn(UserDTO userDTO);
    User SignUp(UserDTO userDTO);
}
