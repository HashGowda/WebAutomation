package FrameWorkB;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {

    @Test
    public void login(){
        LoginPage pageClass = new LoginPage(driver);
        pageClass.Login();
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.navigateToMyInfo();
        myInfoPage.enterPersonalDetails();
    }

    @Test
    public void invalidLogin(){
        LoginPage pageClass = new LoginPage(driver);
        pageClass.Login();
    }
}
