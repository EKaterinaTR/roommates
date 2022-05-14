package ru.itis.roommates.services;

import ru.itis.roommates.DTO.ReviewDTO;
import ru.itis.roommates.models.Flat;
import ru.itis.roommates.models.User;

import java.util.List;

public interface ReviewService {
    Float getUserRatings(User user);
    Float getRoomRating(Flat flat);
    List<ReviewDTO> getReview(User user);
}
