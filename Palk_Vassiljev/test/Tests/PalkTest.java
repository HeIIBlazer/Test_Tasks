/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Palk_Vassiljev.Palk;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class PalkTest {
    
    public PalkTest() {
    }
    @Test
    public void PalkTest1(){
        System.out.println("Test 1");
        Palk obj = new Palk();
        double salary = obj.Palk(1100);
        System.out.println("Годовая зарплата: " + salary);
        System.out.println("------------");
        assertEquals(12400, salary, 0.1);
    }
    @Test
    public void PalkTest2(){
        System.out.println("Test 2");
        Palk obj = new Palk();
        double salary = obj.Palk(1500);
        System.out.println("Годовая зарплата: " + salary);
        System.out.println("------------");
        assertEquals(18000, salary, 0.1);
    }
    @Test
    public void PalkTest3(){
        System.out.println("Test 3");
        Palk obj = new Palk();
        double salary = obj.Palk(2600);
        System.out.println("Годовая зарплата: " + salary);
        System.out.println("------------");
        assertEquals(31200, salary, 0.1);
    }
}
