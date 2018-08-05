package Hotels;

import Guests.Guest;
import RoomAbstract.Room;
import Rooms.BedRoom;
import Rooms.ConfrenceRoom;
import Rooms.DiningRoom;

import java.util.ArrayList;

public class HotelTowers{

    private ArrayList<BedRoom> bedRoomList;
    private ArrayList<ConfrenceRoom> confrenceRoomList;
    private ArrayList<DiningRoom> diningRoomList;

    public HotelTowers(){
        this.bedRoomList = new ArrayList<BedRoom>();
        this.confrenceRoomList = new ArrayList<ConfrenceRoom>();
        this.diningRoomList = new ArrayList<DiningRoom>();

    }

    public ArrayList<BedRoom> getBedRoomList (){
        return this.bedRoomList;
    }

    public ArrayList<ConfrenceRoom> getConfrenceRoomList (){
        return this.confrenceRoomList;
    }

    public ArrayList<DiningRoom> getDiningRoomList (){
        return this.diningRoomList;
    }

    //check in function
    //add guest to BedRoom

    public void checkIn(Guest guest, BedRoom bedRoom) {
        bedRoom.addGuestToList(guest);
    }

    //add check out function
    //remove guest from BedRoom

    public void checkOut(Guest guest, BedRoom bedRoom) {
        bedRoom.removeGuestFromList(guest);
    }
}
