import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Number{

    private number number;

    @Test
    void setUp(){
        number = new input(); 
    }

    @Test
    void testAddition(){
        assertEquals(5, number.add(1,5,2,3,3,7,4,6), (5,1,6,2,7,3,8,4), (9,5,10,1,11.8,12.7))
    }

    @Test
    void testSubtraction(){
        assertEquals(1, calculator.subtract(2, 3));
    }

}