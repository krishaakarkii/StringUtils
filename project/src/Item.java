/**
 * Represents an item in the inventory.
 *
 * <p>This class provides methods for managing item properties.
 * 
 * @author      Krisha Karki
 * @version     2024.05.19
 * @since       17.0
 */
public class Item {

    private String name;
    private double price;

    /**
     * Constructs an item with the specified name and price.
     *
     * @param name the name of the item
     * @param price the price of the item
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the item.
     *
     * @return the name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item.
     *
     * @param name the name of the item
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the price of the item.
     *
     * @return the price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the item.
     *
     * @param price the price of the item
     */
    public void setPrice(double price) {
        this.price = price;
    }

    // Additional methods for managing item properties
}

