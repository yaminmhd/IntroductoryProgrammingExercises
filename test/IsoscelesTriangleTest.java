import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class IsoscelesTriangleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void print() {
        IsoscelesTriangle.print(3);

        assertEquals("  *  " + "\n" +
                " *** " + "\n" +
                "*****" + "\n", outContent.toString());
    }

    @Test
    public void main() {
        IsoscelesTriangle.main(new String[] {});
        assertEquals("  *  " + "\n" +
                " *** " + "\n" +
                "*****" + "\n", outContent.toString());
    }
}