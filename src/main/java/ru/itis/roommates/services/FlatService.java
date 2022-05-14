package ru.itis.roommates.services;

import ru.itis.roommates.DTO.DTOFlat;
import ru.itis.roommates.models.Flat;

public interface FlatService {
    Flat createFlat(DTOFlat flat);


}
