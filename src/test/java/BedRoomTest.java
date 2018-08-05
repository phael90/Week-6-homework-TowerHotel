import Enums.RoomType;
import Guests.Guest;
import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {
    BedRoom bedRoom;
    Guest guest;

    @Before
    public void before() {
        bedRoom = new BedRoom(1, 001, RoomType.SINGLE, 200.00);
        guest = new Guest("Johnatan");
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedRoom.getCapacity());
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(001, bedRoom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.SINGLE, bedRoom.getRoomType());
    }

    @Test
    public void hasNightRate() { assertEquals(200.00,bedRoom.getNightRate(), 2);}

    @Test
    public void canAddGuestToList(){
        bedRoom.addGuestToList(guest);
        assertEquals(1, bedRoom.getGuestList().size());}

    @Test
    public void canRemoveGuestFromList(){
        bedRoom.addGuestToList(guest);
        bedRoom.removeGuestFromList(guest);
        assertEquals(0, bedRoom.getGuestList().size());}

}