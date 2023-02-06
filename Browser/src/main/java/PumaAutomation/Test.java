package PumaAutomation;

public class Test extends BasePage{

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.initialize();
        homePage.navigateTo();

        LoginPage loginPage = new LoginPage();
        loginPage.navigateTo();
        loginPage.getLoginButton().click();
        loginPage.getMobileNo().sendKeys("7795848908");
        loginPage.getOTP().click();
        loginPage.closeDriver();

    }
}
