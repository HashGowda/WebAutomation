package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ITestListenersWithExample {

    int i=0;

    @Test
    public void testMethod(){
        System.out.println("This method will pass and will invoke the onTestSuccess method of ITestListener");
        int i=10;
        Assert.assertEquals(i, 10);
    }

    @Test
    public void testMethod2(){
        System.out.println("This method will fail and will invoke the onTestFailure method of ITestListener");
        int i=10;
        Assert.assertEquals(i,11);
    }

    @Test
    public void testMethod3(){
        System.out.println("This method will skip and will invoke the onTestSkipped method of ITestListener");
        throw new SkipException("Skipping this test case");
    }

    @Test(successPercentage = 50, invocationCount = 5)
    public void testMethod4(){
        i++;
        System.out.println("Test Failed But Within Success Percentage Test Method, invocation count: " + i);
        if (i==1||i==2){
            System.out.println("This will be failed");
            Assert.assertEquals(i,100);
        }
    }
}
