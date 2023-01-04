package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ISuiteListenerWithExample {

    @BeforeSuite
    public void bSuite(){
        System.out.println("BeforeSuite method started for the first ISuiteListener example class");
    }

    @Test
    public void test(){
        System.out.println("Test method started for the first ISuiteListener example class");
    }

    @AfterSuite
    public void aSuite(){
        System.out.println("AfterSuite method started for the first ISuiteListener example class");
    }
}
