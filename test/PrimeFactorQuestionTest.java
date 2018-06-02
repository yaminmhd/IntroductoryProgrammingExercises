import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class PrimeFactorQuestionTest {

    @Test
    public void generatePrimeFactors() {
        HashSet answer = new HashSet<>();
        answer.add(2);
        answer.add(3);
        answer.add(5);
        HashSet list = PrimeFactorQuestion.generate(30);
        assertEquals(answer,list);
    }

    @Test
    public void returnEmptyListWhenArgumentis0(){
        HashSet answer = new HashSet();
        HashSet list = PrimeFactorQuestion.generate(0);
        assertEquals(answer,list);
        assertTrue(list.size() == 0);
    }

    @Test
    public void returnEmptyListWhenArgumentis1(){
        HashSet answer = new HashSet();
        HashSet list = PrimeFactorQuestion.generate(1);
        assertEquals(answer,list);
        assertTrue(list.size() == 0);
    }
}