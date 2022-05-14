package ru.itis.roommates.models;

import ru.itis.roommates.models.address.Address;

public class Flat {
    String uuid;
    Address address;
    Integer roomCount;
    User owner;
    String description;
    Float size;
}
