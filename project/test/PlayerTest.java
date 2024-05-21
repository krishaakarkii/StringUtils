import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("TestPlayer", 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        Player invalidPlayer = new Player(null, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNameSet() {
        player.setName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHealthSet() {
        player.setHealth(-50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAddItem() {
        player.addItem(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRemoveItem() {
        player.removeItem(null);
    }

}

