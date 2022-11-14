package lekcijaSeptini.labDarbs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class firstSeleniumTests {
    WebDriver parluks;
    @BeforeMethod
    public void setupBrowser (){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.lu.lv/");
        parluks.manage().window().maximize();
    }
@AfterMethod
public void tearDownBrowser(){
    parluks.quit();
}
    @Test
    public void testFirstWebpage() {
        parluks.navigate().to("https://www.lu.lv/");
    }
    @Test

    public void testPageTitle() {
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");


    }
}