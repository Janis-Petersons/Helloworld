package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverview {

    WebDriver driver;

    private By checkTitle = By.className("title");
    private By doubleCheckProductName = By.id("item_0_title_link");

    private By finishButton= By.id("finish");

    public WebElement getcheckTitle(){
        return driver.findElement(checkTitle);
    }
    public WebElement getdoubleCheckProductName(){
        return driver.findElement(doubleCheckProductName);
    }
    public WebElement getfinishButton(){
        return driver.findElement(finishButton);
    }
    public CheckoutOverview(WebDriver driver) {
        this.driver =driver;
    }
}
