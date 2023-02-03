package FrameWorkA;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {
    @Test
    public void login(){
        PageClass pageClass=new PageClass(driver);
        pageClass.login();
    }
}
