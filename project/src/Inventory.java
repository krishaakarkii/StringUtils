/**
 * Represents an inventory for storing items.
 *
 * <p>This class provides methods for managing items in the inventory.
 * 
 * @author      Krisha Karki
 * @version     2024.05.18
 * @since       17.0
 */
public class Inventory {

    private List<Item> items;

    /**
     * Constructs an empty inventory.
     */
    public Inventory() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the inventory.
     *
     * @param item the item to add
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Removes an item from the inventory.
     *
     * @param item the item to remove
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Gets the total number of items in the inventory.
     *
     * @return the total number of items
     */
    public int getItemCount() {
        return items.size();
    }

    /**
     * Checks if the inventory contains a specific item.
     *
     * @param item the item to check
     * @return true if the inventory contains the item, false otherwise
     */
    public boolean containsItem(Item item) {
        return items.contains(item);
    }

    // Additional methods for managing inventory items
}

