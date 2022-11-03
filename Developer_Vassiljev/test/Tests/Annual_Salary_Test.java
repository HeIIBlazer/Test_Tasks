/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import developer_vassiljev.Developer;
import developer_vassiljev.DeveloperLogic;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class Annual_Salary_Test {
    
    public Annual_Salary_Test() {}
    
        
    @Test
    public void Annual_Salary_test1() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("Daniil");
        developer.setLastName("Vassiljev");
        developer.setSpecialty("IT spec-Ops");
        developer.setSalary(85249);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(8000, thisDevAnnualSalary, 0.01);
    }
    
    @Test
    public void Annual_Salary_test2() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("Aleksander");
        developer.setLastName("Ipolitov");
        developer.setSpecialty("Marketing");
        developer.setSalary(387878);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(1887, thisDevAnnualSalary, 0.01);
    }
    
    @Test
    public void Annual_Salary_test3() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("darker");
        developer.setLastName("mararna");
        developer.setSpecialty("Big ");
        developer.setSalary(-343355);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(18, thisDevAnnualSalary, 0.01);
    }
    
    @Test
    public void Annual_Salary_test4() {
        DeveloperLogic obj = new DeveloperLogic();
        
        Developer developer = new Developer();
        developer.setFirstName("San");
        developer.setLastName("Laran");
        developer.setSpecialty("Sanim larama");
        developer.setSalary(8549);
        
        int thisDevAnnualSalary = obj.calculateAnnualSalary(developer);
        assertEquals(18.40, thisDevAnnualSalary, 0.01);
    }
    
}
