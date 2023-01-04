package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "data")
    public Object[][] dpMethod(){
        return new Object[][]{{"First-Value"}, {"Second-Value"},{"Third-Value"}};
    }

    @Test(dataProvider = "data")
    void myTest(String val){
        System.out.println("Passed parameter is "+val);
    }

    @DataProvider(name = "pincode")
    public Object[][] pinCode(){
        return new Object[][]{{"560052"},{"560054"},{"562110"}};
    }

    @Test(dataProvider = "pincode")
    void validateProducts(String pinCode){
        System.out.println("Pincode "+pinCode);
    }
}
