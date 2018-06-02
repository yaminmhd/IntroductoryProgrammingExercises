import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HorizontalLineTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void print() {
        HorizontalLine.print(3);
        assertEquals("***", outContent.toString());
    }

    @Test
    public void main() {
        HorizontalLine.main(new String [] {});
        assertEquals("********", outContent.toString());
    }
}