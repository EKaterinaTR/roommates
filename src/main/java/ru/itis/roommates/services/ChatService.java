package ru.itis.roommates.services;

import ru.itis.roommates.models.User;
import ru.itis.roommates.models.chat.Chat;
import ru.itis.roommates.models.chat.Message;

import java.util.List;

public interface ChatService {

    public Chat createChat(User creator, User other);
    public List<Message> getMessages(Chat chat);
    public List<Chat> getChats(User user);
}
