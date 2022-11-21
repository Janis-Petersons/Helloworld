package pageObjectsHomework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutComplete {

    WebDriver driver;

    private By checkoutPageTitle = By.className("title");

private By pressBackHomeButton= By.id("back_to_products");
    public WebElement getcheckoutPageTitle(){
        return driver.findElement(checkoutPageTitle);
    }

    public void clickPressBackHomeButton(){ //void jo nav jādod ārā rezultāti
        driver.findElement(pressBackHomeButton).click();
    }

    public CheckoutComplete(WebDriver driver) {
        this.driver =driver;
    }

}
