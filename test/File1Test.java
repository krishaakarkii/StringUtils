package test;
import src.File1;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the File1 class.
 */
public class File1Test {

    @Test
    public void testSetValue() {
        File1 file1 = new File1();
        file1.setValue(10);
        assertEquals(10, file1.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetValueNegative() {
        File1 file1 = new File1();
        file1.setValue(-1);
    }

    @Test
    public void testGreet() {
        File1 file1 = new File1();
        assertEquals("Hello, John!", file1.greet("John"));
    }

    @Test
    public void testSquare() {
        File1 file1 = new File1();
        assertEquals(25, file1.square(5));
    }

    @Test
    public void testIsEven() {
        File1 file1 = new File1();
        assertTrue(file1.isEven(4));
        assertFalse(file1.isEven(3));
    }

    @Test
    public void testConcatenate() {
        File1 file1 = new File1();
        assertEquals("HelloWorld", file1.concatenate("Hello", "World"));
    }

    @Test(expected = Exception.class)
    public void testThrowException() throws Exception {
        File1 file1 = new File1();
        file1.throwException();
    }
     @Test
public void testSetValueMore() {
    File1 file1 = new File1();
    file1.setValue(20);
    assertEquals(20, file1.getValue());
    file1.setValue(0);
    assertEquals(0, file1.getValue());
}

@Test
public void testGreetMore() {
    File1 file1 = new File1();
    assertEquals("Hello, Alice!", file1.greet("Alice"));
    assertEquals("Hello, Bob!", file1.greet("Bob"));
}

@Test
public void testSquareMore() {
    File1 file1 = new File1();
    assertEquals(16, file1.square(4));
    assertEquals(0, file1.square(0));
}

@Test
public void testIsEvenMore() {
    File1 file1 = new File1();
    assertTrue(file1.isEven(2));
    assertFalse(file1.isEven(1));
}

@Test
public void testConcatenateMore() {
    File1 file1 = new File1();
    assertEquals("AliceBob", file1.concatenate("Alice", "Bob"));
    assertEquals("HelloAlice", file1.concatenate("Hello", "Alice"));
}

@Test(expected = Exception.class)
public void testThrowExceptionMore() throws Exception {
    File1 file1 = new File1();
    file1.throwException();
}

@Test
public void testSetValueExtra() {
    File1 file1 = new File1();
    file1.setValue(100);
    assertEquals(100, file1.getValue());
}

@Test
public void testGreetExtra() {
    File1 file1 = new File1();
    assertEquals("Hello, Copilot!", file1.greet("Copilot"));
}

@Test
public void testSquareExtra() {
    File1 file1 = new File1();
    assertEquals(10000, file1.square(100));
}

@Test
public void testIsEvenExtra() {
    File1 file1 = new File1();
    assertTrue(file1.isEven(100));
}
}

