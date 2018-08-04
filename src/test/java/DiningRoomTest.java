import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(100, "Sushi Madness");
    }

    @Test
    public void capacity() {
        assertEquals(100, diningRoom.getCapacity());
    }

    @Test
    public void name() { assertEquals("Sushi Madness", diningRoom.getName());
    }
}
