package tests;

import cels_to_far.temperature;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FahrenheitTest {
    
    public FahrenheitTest() {}
    
    @Test
    public void fahrenheit_test1() {
        temperature obj = new temperature();
        double fahrenheit = obj.fahrenheit_calculation(56);
        assertEquals(132.8, fahrenheit, 0.1);
    }
    
    @Test
    public void fahrenheit_test2() {
        temperature obj = new temperature();
        double fahrenheit = obj.fahrenheit_calculation(126.2);
        assertEquals(45, fahrenheit, 0.1);
    }
    
    @Test
    public void fahrenheit_test3() {
        temperature obj = new temperature();
        double fahrenheit = obj.fahrenheit_calculation(-51.5);
        assertEquals(45, fahrenheit, 0.1);
    }
    
    @Test
    public void fahrenheit_test4() {
        temperature obj = new temperature();
        double fahrenheit = obj.fahrenheit_calculation(0);
        assertEquals(4, fahrenheit, 0.1);
    }
    
    @Test
    public void fahrenheit_test5() {
        temperature obj = new temperature();
        double fahrenheit = obj.fahrenheit_calculation(0);
        assertEquals(32, fahrenheit, 0.1);
    }
}