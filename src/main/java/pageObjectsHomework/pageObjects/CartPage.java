package pageObjectsHomework.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;

    private By checkoutButton = By.id("checkout");
    private By pagetitle = By.className("title");

    private By productName = By.id("item_0_title_link"); //pārbaudīju kas šis ir unikāls produktua kods precei kas jāpērk
    private By cartElementQnt= By.className("shopping_cart_badge"); //zem šī ir norādīts skaits

    public CartPage(WebDriver driver) {

        this.driver =driver;
    }
    public WebElement getcartElementQnt() {
        return driver.findElement(cartElementQnt);
    }

    public WebElement getProductName() {
        return driver.findElement(productName);
    }
    public WebElement getpageTitle(){
        return driver.findElement(pagetitle);
    }

    public WebElement getCheckoutButton(){ //šeit šī nospiešanas poga tiek identificēt un pašu nospiešanu izsauc Testā
        return driver.findElement(checkoutButton);
    }

}
