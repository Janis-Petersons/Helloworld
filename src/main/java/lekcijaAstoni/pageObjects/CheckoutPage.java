package lekcijaAstoni.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;
    private By pagetitle=By.className("title"); // visi šie ir lokatori
    private By continueButton=By.id("continue");

    private By errorText=By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");
    private By lastNameInputField = By.id("last-name");
    private By zipCodeInputField = By.id("postal-code");

    public void inputFirstName(String vaards){
        driver.findElement(firstNameInputField).sendKeys(vaards); // ar šo norādām ka testā var ievadīt first name info
    }
    public void inputLastName(String uzvaards){
        driver.findElement(lastNameInputField).sendKeys(uzvaards); // ar šo norādām ka testā var ievadīt second name info
    }
    public void inputzipCode(String pastaindekss){
        driver.findElement(zipCodeInputField).sendKeys(pastaindekss); //
    }
    public String geterrorText(){
        return driver.findElement(errorText).getText();
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public CheckoutPage (WebDriver driver) {
        this.driver =driver;
    }
    public WebElement getpageTitle(){
        return driver.findElement(pagetitle);
    }

}

