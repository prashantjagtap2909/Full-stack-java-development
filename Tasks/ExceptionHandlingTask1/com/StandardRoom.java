package com;

public class StandardRoom extends Room {
    public StandardRoom(int roomNumber) {
        this(roomNumber, "Standard");
    }

    private StandardRoom(int roomNumber, String roomType) {
        super(roomNumber, roomType);
    }
}


