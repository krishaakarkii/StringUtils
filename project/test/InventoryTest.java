import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {

    private Inventory inventory;

    @Before
    public void setUp() {
        inventory = new Inventory();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCapacityConstructor() {
        Inventory invalidInventory = new Inventory(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIndexGetItem() {
        Item item = inventory.getItem(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIndexAddItem() {
        inventory.addItem(new Item("Item1"), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIndexRemoveItem() {
        inventory.removeItem(-1);
    }

    @Test(expected = IllegalStateException.class)
    public void testInventoryFull() {
        Inventory smallInventory = new Inventory(1);
        smallInventory.addItem(new Item("Item1"));
        smallInventory.addItem(new Item("Item2"));
    }

}

