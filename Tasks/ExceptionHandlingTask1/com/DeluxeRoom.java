package com;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        this(roomNumber, "Deluxe");
    }

    private DeluxeRoom(int roomNumber, String roomType) {
        super(roomNumber, roomType);
    }
}

