import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    private Board board;

    @Before
    public void setUp() {
        board = new Board();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSizeConstructor() {
        Board invalidBoard = new Board(-1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionGetCell() {
        Cell cell = board.getCell(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionSetCell() {
        board.setCell(-1, 5, CellState.X);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidStateSetCell() {
        board.setCell(1, 1, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidSizeGetRow() {
        Cell[] row = board.getRow(5);
    }

}

