import java.util.ArrayList;
import java.util.List;

/**
 * Represents a level in a game.
 *
 * <p>This class provides methods for managing the level and its components.
 * 
 * @author      Krisha Karki
 * @version     2024.05.20
 * @since       17.0
 */
public class Level {

    private List<Player> players;
    private int levelNumber;

    /**
     * Constructs a level with the specified level number.
     *
     * @param levelNumber the number of the level
     */
    public Level(int levelNumber) {
        this.players = new ArrayList<>();
        this.levelNumber = levelNumber;
    }

    /**
     * Adds a player to the level.
     *
     * @param player the player to add
     */
    public void addPlayer(Player player) {
        players.add(player);
    }

    /**
     * Removes a player from the level.
     *
     * @param player the player to remove
     */
    public void removePlayer(Player player) {
        players.remove(player);
    }

    /**
     * Gets the number of players in the level.
     *
     * @return the number of players
     */
    public int getPlayerCount() {
        return players.size();
    }

    /**
     * Gets the level number.
     *
     * @return the level number
     */
    public int getLevelNumber() {
        return levelNumber;
    }

    // Additional methods for managing level components
}

