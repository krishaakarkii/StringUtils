import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerCount() {
        Game invalidGame = new Game(0);
    }

    @Test(expected = IllegalStateException.class)
    public void testGameAlreadyStarted() {
        game.start();
        game.start();
    }

    @Test(expected = IllegalStateException.class)
    public void testGameNotStarted() {
        game.move(1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMove() {
        game.start();
        game.move(-1, 0);
    }

    @Test(expected = IllegalStateException.class)
    public void testGameAlreadyEnded() {
        game.start();
        game.end();
        game.move(1, 1);
    }

}

