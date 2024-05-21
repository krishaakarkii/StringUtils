import java.util.HashMap;
import java.util.Map;

/**
 * Represents the score of a player in a game.
 *
 * <p>This class provides methods for managing the player's score.
 * 
 * @author      Krisha Karki
 * @version     2024.05.21
 * @since       17.0
 */
public class Score {

    private Map<String, Integer> scores;

    /**
     * Constructs a score object.
     */
    public Score() {
        this.scores = new HashMap<>();
    }

    /**
     * Increases the score of the specified player by the given amount.
     *
     * @param player the name of the player
     * @param amount the amount by which to increase the score
     */
    public void increaseScore(String player, int amount) {
        int currentScore = scores.getOrDefault(player, 0);
        scores.put(player, currentScore + amount);
    }

    /**
     * Gets the score of the specified player.
     *
     * @param player the name of the player
     * @return the score of the player
     */
    public int getScore(String player) {
        return scores.getOrDefault(player, 0);
    }

    // Additional methods for managing scores
}

