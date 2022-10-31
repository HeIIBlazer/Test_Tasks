package tests;

import bank_deposit.Bank;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Bank_Test {
    public Bank_Test() {}

    @Test
    public void deposit_test1() {
        Bank obj = new Bank();
        double input_percentage = 25;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else {
            if(input_percentage >= 25) {
                System.out.println("Percentage is 25 or more!");
            } else {
                System.out.println("Percentage is 0 or less!");
            }
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
    
    @Test
    public void deposit_test2() {
        Bank obj = new Bank();
        double input_percentage = 24;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else if (input_percentage >= 25) {
            System.out.println("Percentage is 25 or more!");
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        } else if (input_percentage <= 0) {
            System.out.println("Percentage is 0 or less!");
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
    
    @Test
    public void deposit_test3() {
        Bank obj = new Bank();
        double input_percentage = 0;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else {
            if(input_percentage >= 25) {
                System.out.println("Percentage is 25 or more!");
            } else {
                System.out.println("Percentage is 0 or less!");
            }
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
    
    @Test
    public void deposit_test4() {
        Bank obj = new Bank();
        double input_percentage = -1;
        double[] result = obj.deposit_increase(input_percentage);
        
        if(result != null) {
            int month = (int)result[1];
            double final_deposit = result[0];
            System.out.println("final deposit: " + final_deposit + " - months: " + month);
            assertEquals(final_deposit, 1260, 0.01);
        } else {
            if(input_percentage >= 25) {
                System.out.println("Percentage is 25 or more!");
            } else {
                System.out.println("Percentage is 0 or less!");
            }
            assertEquals("Percentage must be 0.01 - 24.99", input_percentage);
        }
    }
}
