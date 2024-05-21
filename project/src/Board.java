/**
 * Represents a game board.
 *
 * <p>The board consists of a grid of cells where game items can be placed.
 * It provides methods for accessing and manipulating the cells and items.
 * 
 * @author      Krisha Karki
 * @version     2024.05.17
 * @since       17.0
 */
public class Board {

    /**
     * The width of the board.
     */
    private int width;

    /**
     * The height of the board.
     */
    private int height;

    /**
     * Constructs a board with the specified dimensions.
     *
     * @param width  the width of the board
     * @param height the height of the board
     */
    public Board(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Gets the width of the board.
     *
     * @return the width of the board
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height of the board.
     *
     * @return the height of the board
     */
    public int getHeight() {
        return height;
    }

    /**
     * Checks if the given coordinates are within the bounds of the board.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @return true if the coordinates are within bounds, false otherwise
     */
    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }


}

