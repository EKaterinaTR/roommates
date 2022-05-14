package ru.itis.roommates.services;

import ru.itis.roommates.DTO.NeighborAdDTO;
import ru.itis.roommates.DTO.NeighborDescriptionDTO;
import ru.itis.roommates.models.NeighborDescription;

import java.util.List;

public interface NeighborAdService {
    public List<NeighborAdDTO> getAllAds();
    public List<NeighborAdDTO> getAdsByDescription(NeighborDescriptionDTO neighborDescriptionDTO);
}
