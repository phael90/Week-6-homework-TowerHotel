import Rooms.BedRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {
    BedRoom bedRoom;

    @Before
    public void before() {
        bedRoom = new BedRoom(1, 001, "SINGLE", 200.00);
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
    public void nightRate() {
        assertEquals(200.00, bedRoom.getNightRate(), 0 );
    }

}