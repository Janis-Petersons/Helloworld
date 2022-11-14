package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoTest {
    WebDriver parluks;
    @BeforeMethod
    public void setupBrowser (){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.saucedemo.com/");
        parluks.manage().window().maximize();
    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }
    @Test
    public void testloginWrongUsernameAndPassword(){
        testLogin("asdaaaa","password","Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void testloginEmptyUsernameAndPassword(){
        testLogin("","","Epic sadface: Username is required");
    }
    @Test
    public void testLoginEmptyUsernameAndEmptyPassword(){
        testLogin("","trhthtj","Epic sadface: Username is required");
    }
    @Test
    public void testLoginFilledUsernameAndEmptyUsername(){
        testLogin("trertre","","Epic sadface: Password is required");
    }

    private void testLogin(String username, String passwords, String expectecErrorMessage){
        WebElement lietotajsvardsIevadeslauks = parluks.findElement(By.id("user-name"));
        lietotajsvardsIevadeslauks.sendKeys("username");

        WebElement parolesievadeslauks = parluks.findElement(By.id("password"));
        parolesievadeslauks.sendKeys("password");

        WebElement loginpoga = parluks.findElement(By.id("login-button"));
        loginpoga.click();

        WebElement errortextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorText=errortextField.getText();
        Assert.assertEquals(errorText,expectecErrorMessage);



    }

    }




