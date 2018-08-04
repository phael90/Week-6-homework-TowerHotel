package Rooms;

import RoomAbstract.Room;

import java.util.ArrayList;

public class ConfrenceRoom extends Room {
    private String name;
    private double dailyRate;

    public ConfrenceRoom(int capacity, String name, double dailyRate){
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
