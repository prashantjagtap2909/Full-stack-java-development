package com;

public class Reservation {
    private Guest guest;

    public Reservation(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }
}

