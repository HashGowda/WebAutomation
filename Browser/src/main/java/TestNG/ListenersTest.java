package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListenersTest {

    @Test
    void test1(){
        System.out.println("Test1");
    }

    @Test
    void test2(){
        System.out.println("Test2");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After class");
    }
}
