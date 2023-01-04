package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeTest
    @Parameters({"Appium"})
    public void beforeTest(String version){
        System.out.println("Before Test");
        System.out.println("Appium version "+version);
    }

    @Parameters({"Selenium"})
    @Test
    public void test(String version){
        try {
            System.out.println("My test case");
            System.out.println("Selenium version "+version);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
