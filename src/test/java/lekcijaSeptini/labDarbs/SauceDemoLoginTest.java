//package lekcijaSeptini.labDarbs;
//
//import lekcijaAstoni.pageObjects.LoginPage;
//import lekcijaAstoni.pageObjects.ProductsPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class SauceDemoLoginTest extends BaseTest {
//
//@Test
//public void testLoginPageObjectExample(){
//    LoginPage loginPage = new LoginPage(parluks);
//    loginPage.login("sfsdfsa", "dflksdfjsdlkj");
//    Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any user in this service");
//}
//
//    @Test
//    public void testLoginWrongUsernameAndPassword() {
//        LoginPage loginPage = new LoginPage(parluks);
//        loginPage.login("sfsdfsa", "dflksdfjsdlkj");
//        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any user in this service");
//    }
//
//    @Test
//    public void testLoginEmptyUsernameAndPassword() {
//        LoginPage loginPage = new LoginPage(parluks);
//        loginPage.login("", "");
//        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username is required");
//    }
//
//    @Test
//    public void testLoginEmptyUsernameAndFilledPassword () {
//        LoginPage loginPage = new LoginPage(parluks);
//        loginPage.login("", "jkhkjhkjhkjh");
//        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username is required");
//    }
//    @Test
//    public void testLoginFilledUsernameAndEmptyPassword () {
//        LoginPage loginPage = new LoginPage(parluks);
//        loginPage.login("fgsfdgfgfgd", "Epic sadface: Password is required");
//    }
//
//@Test
//    public void testsSuccessfulLogin(){
//    LoginPage loginPage= new LoginPage(parluks);
//    loginPage.login();
//    loginPage.login("standard_user","secret_sauce");
//    ProductsPage produktuLapa = new ProductsPage(parluks);
//    Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");
//}
//
//}
//
//
//
//
