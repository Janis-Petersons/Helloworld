package lekcijaSeptini.labDarbs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class firstSeleniumTests {
    WebDriver parluuks;
    @BeforeMethod
    public void setupBrowser (){
        parluuks = new ChromeDriver();
        parluuks.navigate().to("https://www.lu.lv/");
        parluuks.manage().window().maximize();
    }
@AfterMethod
public void tearDownBrowser(){
    parluuks.quit();
}
    @Test
    public void testFirstWebpage() {
        parluuks.navigate().to("https://www.lu.lv/");
    }
    @Test

    public void testPageTitle() {
        String nosaukums = parluuks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");


    }
}