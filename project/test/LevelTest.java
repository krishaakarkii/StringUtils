import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LevelTest {

    private Level level;

    @Before
    public void setUp() {
        level = new Level("TestLevel", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        Level invalidLevel = new Level(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNameSet() {
        level.setName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumberSet() {
        level.setNumber(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAddItem() {
        level.addItem(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRemoveItem() {
        level.removeItem(null);
    }

}

