/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Salary_Vassiljev.Salary;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class Salary_Test {
    
    public Salary_Test() {}
    @Test
    public void PalkTest1(){
        Salary obj = new Salary();
        double salary = obj.Salary(12000);
        assertEquals(124, salary, 0.1);
    }
    @Test
    public void PalkTest2(){
        Salary obj = new Salary();
        double salary = obj.Salary(1900);
        assertEquals(18020, salary, 0.1);
    }
    @Test
    public void PalkTest3(){
        Salary obj = new Salary();
        double salary = obj.Salary(2600);
        assertEquals(319900, salary, 0.1);
    }
    
    @Test
    public void PalkTest4(){
        Salary obj = new Salary();
        double salary = obj.Salary(1200);
        assertEquals(14400, salary, 0.1);
    }
}
