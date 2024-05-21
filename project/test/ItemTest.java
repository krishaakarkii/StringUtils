import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() {
        item = new Item("TestItem", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        Item invalidItem = new Item(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNameSet() {
        item.setName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidWeightSet() {
        item.setWeight(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidUse() {
        item.use(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testItemAlreadyUsed() {
        item.use("Test");
        item.use("Test2");
    }

}

