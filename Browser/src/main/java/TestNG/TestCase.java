package TestNG;

import org.testng.annotations.*;

public class TestCase {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after method");
    }

    @Test
    void test1(){
        System.out.println("This is test1");
    }

    @Test
    void test2(){
        System.out.println("This is test2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before the test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after the test");
    }

}
