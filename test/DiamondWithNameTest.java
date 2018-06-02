import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DiamondWithNameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private String output = "  *  " + "\n" +
            " *** " + "\n" +
            "Yamin" + "\n" +
            " *** " + "\n" +
            "  *  " + "\n";

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void print() {
        DiamondWithName.print(3);
        assertEquals(output, outContent.toString());
    }

    @Test
    public void main() {
        DiamondWithName.main(new String[] {});
        assertEquals(output, outContent.toString());
    }
}