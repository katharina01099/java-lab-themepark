import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Crashcourse", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Crashcourse", dodgems.getName());
    }

//    @Test
//    public void hasAgeRestriction(){
//        assertEquals(true, dodgems.age());
//
//    }

    @Test
    public void hasRatings(){
        assertEquals(5, dodgems.getRating());
    }

}