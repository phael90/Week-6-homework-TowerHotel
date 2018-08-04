import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Johnatan");
    }

    @Test
    public void name() { assertEquals("Johnatan", guest.getName());}
}
