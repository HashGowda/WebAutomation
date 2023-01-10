package FrameWorkC;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login();
    }

    @Test
    public void adminPage(){
        AdminPage adminPage = new AdminPage(driver);
        adminPage.navigateToAdmin();
        adminPage.enterDetails();
        adminPage.clickSearch();
        adminPage.clickRadioBtn();
    }


    @Test
    public void invalidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login();
    }
}
