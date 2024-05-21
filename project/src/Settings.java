/**
 * Represents the settings of a game.
 *
 * <p>This class provides methods for managing game settings.
 * 
 * @author      Krisha Karki
 * @version     2024.05.18
 * @since       17.0
 */
public class Settings {

    private boolean soundEnabled;
    private int difficultyLevel;

    /**
     * Constructs a settings object with default values.
     */
    public Settings() {
        this.soundEnabled = true;
        this.difficultyLevel = 1;
    }

    /**
     * Checks if sound is enabled.
     *
     * @return true if sound is enabled, false otherwise
     */
    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    /**
     * Enables or disables sound.
     *
     * @param soundEnabled true to enable sound, false to disable
     */
    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    /**
     * Gets the difficulty level.
     *
     * @return the difficulty level
     */
    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    /**
     * Sets the difficulty level.
     *
     * @param difficultyLevel the difficulty level
     */
    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    // Additional methods for managing game settings
}

