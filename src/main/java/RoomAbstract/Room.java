package RoomAbstract;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList getGuestList(){
        return this.guestList;
    }
}
