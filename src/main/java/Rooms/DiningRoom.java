package Rooms;

import Guests.Guest;
import RoomAbstract.Room;

import java.util.ArrayList;

public class DiningRoom extends Room {
    private String name;
    private double dailyRate;

    public DiningRoom(int capacity){
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName(){
        return name;
    }

    public double getDailyRate(){
        return dailyRate;
    }
}
