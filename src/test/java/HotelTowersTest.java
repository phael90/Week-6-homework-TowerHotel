import Guests.Guest;
import Hotels.HotelTowers;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTowersTest {
    HotelTowers hotelTowers;
    Guest guest;
    BedRoom bedRoom;

    @Before
    public void before() {
        hotelTowers = new HotelTowers();
        guest = new Guest("Johnatan");
        bedRoom = new BedRoom(1, 001, "SINGLE", 200.00);
    }

        @Test
        public void bedRoomList () {
            assertEquals(0, hotelTowers.getBedRoomList().size());
        }

        @Test
        public void getconfrenceRoomList () {
            assertEquals(0, hotelTowers.getConfrenceRoomList().size());
        }

        @Test
        public void getdiningRoomList () {
            assertEquals(0, hotelTowers.getDiningRoomList().size());
        }

        @Test
        public void canCheckIn () {
            hotelTowers.checkIn(guest, bedRoom);
            assertEquals(1, bedRoom.getGuestList().size());
        }


        @Test
        public void canCheckOut () {
            hotelTowers.checkIn(guest, bedRoom);
            hotelTowers.checkOut(guest, bedRoom);
            assertEquals(0, bedRoom.getGuestList().size());
        }

        @Test
        public void canCheckGuestinRoom () {
            hotelTowers.checkIn(guest, bedRoom);
            assertEquals(1,bedRoom.getGuestList().size());
        }
}

