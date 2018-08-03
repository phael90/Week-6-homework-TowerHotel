package Rooms;

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

}