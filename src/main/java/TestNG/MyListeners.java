package TestNG;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyListeners implements ISuiteListener {

    @Override
    public void onStart(ISuite Suite){
        //BeforeSuite
        System.out.println("onStart function started of ISuiteListener ");
    }

    @Override
    public void onFinish(ISuite Suite){
        //AfterSuite
        System.out.println("onFinish function started of ISuiteListener ");
    }

}
