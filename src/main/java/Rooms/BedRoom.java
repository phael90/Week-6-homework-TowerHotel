package Rooms;

import Enums.RoomType;
import Guests.Guest;
import RoomAbstract.Room;

public class BedRoom extends Room {
    private int roomNumber;
    private RoomType roomType;
    private double nightRate;

    public BedRoom(int capacity, int roomNumber, RoomType roomType, double nightRate){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightRate = nightRate;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public RoomType getRoomType(){
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
