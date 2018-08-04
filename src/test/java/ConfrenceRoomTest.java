import Rooms.ConfrenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfrenceRoomTest {
    ConfrenceRoom confrenceRoom;

    @Before
    public void confrenceRoom() {
        confrenceRoom = new ConfrenceRoom(20, "Dimond Confrence Room", 20000.00);
    }

    @Test
    public void capacity(){
        assertEquals(20, confrenceRoom.getCapacity());
    }

    @Test
    public void name(){
        assertEquals("Dimond Confrence Room", confrenceRoom.getName());
    }

    @Test
    public void dailyRate(){
        assertEquals(20000.00, confrenceRoom.getDailyRate(), 0);
    }

}
