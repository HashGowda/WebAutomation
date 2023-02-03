package TestNG;

import org.testng.annotations.Test;

public class GroupExample {

    @Test(groups = {"Smoke"})
    public void test1(){
        System.out.println("My test case1");
    }

    @Test(groups = {"Smoke", "Sanity"})
    public void test2(){
        System.out.println("My test case2");
    }

    @Test(groups = {"Sanity"})
    public void test3(){
        System.out.println("My test case3");
    }

    @Test(groups = {"Sanity"})
    public void test4(){
        System.out.println("My test case4");
    }

    @Test(groups = {"Regression"})
    public void test5(){
        System.out.println("My test case5");
    }

    @Test(groups = {"Smoke","Sanity","Regression"})
    public void test6(){
        System.out.println("My test case6");
    }
}
