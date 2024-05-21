import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ScoreTest {

    private Score score;

    @Before
    public void setUp() {
        score = new Score(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor() {
        Score invalidScore = new Score(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAddPoints() {
        score.addPoints(-50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidRemovePoints() {
        score.removePoints(-20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSetPoints() {
        score.setPoints(-30);
    }

    @Test(expected = IllegalStateException.class)
    public void testNegativeScore() {
        Score negativeScore = new Score(-10);
    }

}

