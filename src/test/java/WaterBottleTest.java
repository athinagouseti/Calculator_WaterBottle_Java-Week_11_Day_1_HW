import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;
    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void hasDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, waterbottle.fill());
    }

}
