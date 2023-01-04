package TestNG;

import org.testng.annotations.Test;

public class InvocationExample {

    @Test(priority = -1)
    void test1(){
        System.out.println("test1");
    }

    @Test(priority = -2)
    void test2(){
        System.out.println("test2");
    }

    @Test(invocationCount = 5)
    void test3(){
        System.out.println("test3");
    }
}
