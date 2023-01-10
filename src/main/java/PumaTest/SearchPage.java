package PumaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class SearchPage {
    public WebDriver driver;

    CommonFunc commonFunc;

    public SearchPage(WebDriver driver){
        this.driver=driver;
        commonFunc = new CommonFunc(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@type='search']")
    WebElement searchBox;

    @FindBy(xpath = "(//*[@*='text-3xl w-[1em] h-[1em] text-white fill-current'])[1]")
    WebElement searchButton;

    @FindBy(xpath = "(//*[@*='text-3xl w-[1em] h-[1em] text-white fill-current'])[3]")
    WebElement clickOnCart;

    @FindBy(xpath = "//*[text()='MEN']")
    WebElement menBtn;

    @FindBy(xpath = "//*[@id=\"product-list-items\"]/li[6]/div[3]/a/h3")
    WebElement clickItem;

    @FindBy(xpath = "(//*[@class='absolute inset-0 flex items-center justify-center'])[4]")
    WebElement size;

    @FindBy(xpath = "//button[@data-test-id='pdp-add-to-cart']")
    WebElement addToCart;

    @FindBy(xpath = "//*[@data-test-id='minicart-cart-link']")
    WebElement viewCartAndCheckout;

    @FindBy(id = "quantity-select-22a31f84531568e16dcb522668")
    WebElement quantity;

    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement checkoutButton;

    public void search(){
        commonFunc.sendKeys(searchBox,"Mens Shoes");
        commonFunc.waitAndClick(searchButton);
        commonFunc.waitAndClick(clickOnCart);
        commonFunc.waitAndClick(menBtn);
        commonFunc.waitAndClick(clickItem);
        commonFunc.waitAndClick(size);
        commonFunc.waitAndClick(addToCart);
        commonFunc.waitAndClick(viewCartAndCheckout);
        commonFunc.dropDown(quantity, "4");
        commonFunc.waitAndClick(checkoutButton);
    }
}
