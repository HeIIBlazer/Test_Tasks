/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.junit.Test;
import static org.junit.Assert.*;
import  developer_vassiljev.Developer;
import  developer_vassiljev.DeveloperLogic;

/**
 *
 * @author pupil
 */
public class hourRate_Test {
    
    public hourRate_Test() {}
    
    @Test
    public void hour_rate_test1() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("Daniil");
        developer.setLastName("Vassiljev");
        developer.setSpecialty("IT spec-Ops");
        developer.setSalary(2000);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(24, thisDevHourSalary, 0.01);
    }
    
    @Test
    public void hour_rate_test2() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("Aleksander");
        developer.setLastName("Ipolitov");
        developer.setSpecialty("Marketing Manager");
        developer.setSalary(3000);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(18, thisDevHourSalary, 0.01);
    }
    
    @Test
    public void hour_rate_test3() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("Marquise");
        developer.setLastName("De Valera");
        developer.setSpecialty("Big Boss");
        developer.setSalary(-5555);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(18, thisDevHourSalary, 0.01);
    }
    
    @Test
    public void hour_rate_test4() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("BOMB");
        developer.setLastName("Karamba");
        developer.setSpecialty("Sanim Danim");
        developer.setSalary(8000);
        
        int thisDevHourSalary = obj.calculateHourRate(developer);
        assertEquals(18.40, thisDevHourSalary, 0.01);
    }
    
    
}
