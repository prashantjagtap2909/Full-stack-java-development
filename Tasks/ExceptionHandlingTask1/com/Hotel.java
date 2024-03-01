package com;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> availableRooms;
    private List<Reservation> reservations;

    public Hotel() {
        availableRooms = new ArrayList<>();
        reservations = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        for (int i = 1; i <= 5; i++) {
            availableRooms.add(new StandardRoom(i));
            availableRooms.add(new DeluxeRoom(i + 100));
            availableRooms.add(new SuiteRoom(i + 200));
        }
    }

    public void makeReservation(Guest guest, Room room) throws InvalidReservationException {
        if (!availableRooms.contains(room)) {
            throw new InvalidReservationException("Selected room is not available.");
        }

        Reservation reservation = new Reservation(guest);
        reservations.add(reservation);
        availableRooms.remove(room);

        System.out.println("Reservation successful for " + room.getRoomType() + " room with room number " + room.getRoomNumber() + " by guest " + guest.getName());
    }
    public Room findRoomByNumber(int roomNumber) throws RoomNotFoundException {
        for (int i = 0; i < availableRooms.size(); i++) {
            Room room = availableRooms.get(i);
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        throw new RoomNotFoundException("Room with number " + roomNumber + " not found.");
    }



    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (int i = 0; i < availableRooms.size(); i++) {
            Room room = availableRooms.get(i);
            System.out.println("Room Type " + room.getRoomType() + "  Room Number: " + room.getRoomNumber());
        }
    }
}

