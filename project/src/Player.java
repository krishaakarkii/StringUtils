/**
 * Represents a player in a game.
 *
 * <p>This class provides methods for managing player attributes and actions.
 * 
 * @author      Krisha Karki
 * @version     2024.05.20
 * @since       17.0
 */
public class Player {

    private String name;
    private int score;

    /**
     * Constructs a player with the specified name.
     *
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    /**
     * Gets the name of the player.
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the player.
     *
     * @param name the name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the score of the player.
     *
     * @return the score of the player
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets the score of the player.
     *
     * @param score the score of the player
     */
    public void setScore(int score) {
        this.score = score;
    }

    // Additional methods for managing player attributes and actions
}

