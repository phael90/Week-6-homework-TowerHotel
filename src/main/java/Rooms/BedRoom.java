package Rooms;

import Guests.Guest;
import RoomAbstract.Room;

public class BedRoom extends Room {
    private int roomNumber;
    private String roomType;
    private double nightRate;

    public BedRoom(int capacity, int roomNumber, String roomType, double nightRate){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightRate = nightRate;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public String getRoomType(){
        return roomType;
    }

    public double getNightRate(){
        return nightRate;
    }

    public void addGuestToList(Guest guest) {
        getGuestList().add(guest);
    }

    public void removeGuestFromList(Guest guest) {
        getGuestList().remove(guest);
    }

}
