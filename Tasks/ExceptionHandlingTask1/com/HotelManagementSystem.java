package com;
import java.util.Scanner;
public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        
        Guest guest1 = new Guest("Prashant");
        Guest guest2 = new Guest("Rohit");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("Choose a room type to reserve:");
                System.out.println("1. Standard Room (start with 1)");
                System.out.println("2. Deluxe Room (start with 101)");
                System.out.println("3. Suite Room (start with 201)");
                System.out.println("4. Find room is available or not");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        hotel.makeReservation(guest1, new StandardRoom(1));
                        break;
                    case 2:
                        hotel.makeReservation(guest2, new DeluxeRoom(101));
                        break;
                    case 3:
                    	hotel.makeReservation(guest2, new SuiteRoom(601));
                        break;
                    case 4: 
                    	try {
                            System.out.print("Enter the room number to find: ");
                            int roomNumberToFind = scanner.nextInt();

                            Room foundRoom = hotel.findRoomByNumber(roomNumberToFind);
                            System.out.println("Room Number: " + foundRoom.getRoomNumber() + " Type: " + foundRoom.getClass().getSimpleName() + " is available....");

                            
                        } catch (RoomNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        } 
                    	break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 0);

        } catch (InvalidReservationException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        
        hotel.displayAvailableRooms();
    }
}
