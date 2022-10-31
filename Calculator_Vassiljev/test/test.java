import calculator_vassiljev.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class test {

 public test() {
 }
 @Test
 public void test_liitmine(){ //�������� ��������
    //������� ������ ������
    Calculator obj=new Calculator();
   //�������� ����� ������ liitmine() � ����������� //�����������
    double tulemus=obj.liitmine(3,5);
   //���� ����� �������� �� ������ ���������, �� ����� //Assert.fail ������ �� ������
    if (tulemus!=8) Assert.fail();
 }
 ///////////////////////////////////////////
 @Test
 public void test_lahutamine(){
    Calculator obj=new Calculator();
    double tulemus=obj.lahutamine(5,5);
    if (tulemus!=0) Assert.fail();
    }
///////////////////////////////////////////
 @Test
 public void test_korrutamine(){
    Calculator obj=new Calculator();
    double tulemus=obj.korrutamine(5,5);
    if (tulemus!=25) Assert.fail();
    }
 ///////////////////////////////////////////
 @Test
 public void test_jagamine(){
    Calculator obj=new Calculator();
    double tulemus=obj.jagamine(15,5);
    if (tulemus!=3) Assert.fail();
    }
} 
