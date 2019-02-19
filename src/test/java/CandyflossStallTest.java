import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyflossStallTest {

    CandyflossStall candyflossStall;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("Sugarhigh", "Mr. Pink", 20);
    }

    @Test
    public void stallHasName(){
        assertEquals("Sugarhigh", candyflossStall.getName());
    }
}
