package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners2 implements ITestListener {

    @Override
    public void onFinish(ITestContext txt){
        System.out.println("onFinish method completed");
    }

    @Override
    public void onStart(ITestContext txt){
        System.out.println("onStart method started");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult text){
        System.out.println("Method failed with certain success percentage "+text.getName());
    }

    @Override
    public void onTestFailure(ITestResult text){
        System.out.println("Method failed "+text.getName());
    }

    @Override
    public void onTestStart(ITestResult text){
        System.out.println("Method started "+text.getName());
    }

    @Override
    public void onTestSuccess(ITestResult text){
        System.out.println("Method succeeded "+text.getName());
    }

    @Override
    public void onTestSkipped(ITestResult text){
        System.out.println("Method skipped "+text.getName());
    }
}
