package com;

public class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber) {
        this(roomNumber, "Suite");
    }

    private SuiteRoom(int roomNumber, String roomType) {
        super(roomNumber, roomType);
    }
}

