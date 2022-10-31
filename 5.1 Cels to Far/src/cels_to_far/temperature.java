package cels_to_far;

public class temperature {
    
    public double fahrenheit_calculation(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    
    public double celsius_calculation(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    } 


}

