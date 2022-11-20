package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {

    WebDriver parluks;
    WebDriverWait wait;

    private By pageTitle = By.cssSelector("span.title"); //lokatori daļām no web lapas
    private By cartButton = By.id("shopping_cart_container");

    private By addProducttoCart = By.id("add-to-cart-sauce-labs-bike-light");

    public ProductsPage(WebDriver parluks) {
        this.parluks = parluks;
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
    }

    public WebElement getCartButton() {

        return parluks.findElement(cartButton);
    }

    public WebElement getPageTitle() {
        return parluks.findElement(pageTitle);
    }

    public WebElement getaddProducttoCart() {
        return parluks.findElement(addProducttoCart);
    }




}
