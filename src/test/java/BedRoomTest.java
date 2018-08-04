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
        bedRoom = new BedRoom(1, 001, "SINGLE", 200.00);
        guest = new Guest("Johnatan");
    }

    @Test
    public void capacity() {
        assertEquals(1, bedRoom.getCapacity());
    }

    @Test
    public void roomNumber() {
        assertEquals(001, bedRoom.getRoomNumber());
    }

    @Test
    public void roomType() {
        assertEquals("SINGLE", bedRoom.getRoomType());
    }

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