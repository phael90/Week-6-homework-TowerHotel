import Enums.RoomType;
import Guests.Guest;
import Hotels.HotelTowers;
import RoomAbstract.Room;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTowersTest {
    HotelTowers hotelTowers;
    Guest guest_1;
    Guest guest_2;
    Guest guest_3;
    BedRoom bedRoom_1;
    BedRoom bedRoom_2;
    BedRoom bedRoom_3;

    @Before
    public void before() {
        hotelTowers = new HotelTowers();
        guest_1 = new Guest("Johnatan");
        guest_2 = new Guest("John");
        guest_3 = new Guest("Alice");
        bedRoom_1 = new BedRoom(1, 001, RoomType.SINGLE, 200.00);
        bedRoom_2 = new BedRoom(2, 002, RoomType.DOUBLE, 100.00);
        bedRoom_3 = new BedRoom(2, 003, RoomType.DOUBLE, 200.00);

    }

    @Test
    public void bedRoomList() {
        assertEquals(0, hotelTowers.getBedRoomList().size());
    }

    @Test
    public void getconfrenceRoomList() {
        assertEquals(0, hotelTowers.getConfrenceRoomList().size());
    }

    @Test
    public void getdiningRoomList() {
        assertEquals(0, hotelTowers.getDiningRoomList().size());
    }

    @Test
    public void canCheckIn() {
        hotelTowers.checkIn(guest_1, bedRoom_1);
        assertEquals(1, bedRoom_1.getGuestList().size());
    }


    @Test
    public void canCheckOut() {
        hotelTowers.checkIn(guest_1, bedRoom_1);
        hotelTowers.checkOut(guest_1, bedRoom_1);
        assertEquals(0, bedRoom_1.getGuestList().size());
    }

    @Test
    public void canCheckGuestinRoom() {
        hotelTowers.checkIn(guest_1, bedRoom_1);
        assertEquals(1, bedRoom_1.getGuestList().size());
    }

    @Test
    public void canAddRoomToBedRoomList() {
        hotelTowers.addRoomToHotelBedRoomList(bedRoom_1);
        assertEquals(1, hotelTowers.getBedRoomList().size());
    }

    @Test
    public void canReturnAvailableRooms() {
        hotelTowers.checkIn(guest_1, bedRoom_1);
        hotelTowers.checkIn(guest_2, bedRoom_2);
        hotelTowers.checkIn(guest_3, bedRoom_2);
        hotelTowers.addRoomToHotelBedRoomList(bedRoom_1);
        hotelTowers.addRoomToHotelBedRoomList(bedRoom_2);
        hotelTowers.addRoomToHotelBedRoomList(bedRoom_3);
        assertEquals(1, hotelTowers.availableRooms().size());
    }
}

