import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FizzBuzzQuestionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testFizz() {
        FizzBuzzQuestion.fizzBuzz(3);
        assertEquals("1\n2\nFizz\n", outContent.toString());
    }

    @Test
    public void testBuzz(){
        FizzBuzzQuestion.fizzBuzz(5);
        assertEquals("1\n2\nFizz\n4\nBuzz\n", outContent.toString());
    }

    @Test
    public void testFizzBuzz(){
        FizzBuzzQuestion.fizzBuzz(15);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", outContent.toString());
    }

}