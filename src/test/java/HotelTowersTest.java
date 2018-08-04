import Hotels.HotelTowers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTowersTest {
    HotelTowers hotelTowers;

    @Before
    public void before() {
        hotelTowers = new HotelTowers(); }

    @Test
    public void bedRoomList( ) {assertEquals(0, hotelTowers.getBedRoomList().size());}

    @Test
    public void getconfrenceRoomList() {assertEquals(0, hotelTowers.getConfrenceRoomList().size());}

    @Test
    public void getdiningRoomList() {assertEquals(0, hotelTowers.getDiningRoomList().size());}
}
