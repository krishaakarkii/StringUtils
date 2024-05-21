import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SettingsTest {

    private Settings settings;

    @Before
    public void setUp() {
        settings = new Settings();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetResolution() {
        settings.setResolution(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetSoundVolume() {
        settings.setSoundVolume(-50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetMusicVolume() {
        settings.setMusicVolume(-20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetDifficulty() {
        settings.setDifficulty(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetLanguage() {
        settings.setLanguage(null);
    }

}

