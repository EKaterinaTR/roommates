package ru.itis.roommates.services;

import ru.itis.roommates.models.User;

public interface AdminService {
    public boolean ban(User user);
    public boolean noBan(User user);

}
