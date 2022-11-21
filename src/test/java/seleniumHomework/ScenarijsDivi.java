package seleniumHomework;

import pageObjectsHomework.pageObjects.CartPage;
import pageObjectsHomework.pageObjects.CheckoutPage;
import pageObjectsHomework.pageObjects.LoginPage;
import pageObjectsHomework.pageObjects.ProductsPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

//import lekcijaAstoni.pageObjects.CartPage;
//import lekcijaAstoni.pageObjects.CheckoutPage;
//import lekcijaAstoni.pageObjects.LoginPage;
//import lekcijaAstoni.pageObjects.ProductsPage;
//import lekcijaSeptini.labDarbs.BaseTest;
//import org.testng.Assert;
//import org.testng.annotations.Test;


public class ScenarijsDivi extends BaseTest {

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/");
        //Base tests augšā jau palaiž pārlūku

        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage= new LoginPage(parluks);
        ProductsPage produktuLapa = new ProductsPage(parluks);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");
        Thread.sleep(5000);

        System.out.println("3. Doties uz grozu");
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Thread.sleep(5000);
        Assert.assertEquals(grozaLapa.getpageTitle().getText(),"YOUR CART");

        System.out.println("4. Doties uz Checkout");
        grozaLapa.getCheckoutButton().click(); //šeit norādām ka jāpānem info page objekcts
        Thread.sleep(5000);

        System.out.println("5.Pārbaudīt,  tName/Zip code ir obligāts");
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getpageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton(); //šeit mēs jau bijām definējuši pageobjects kas ir jāspiež
        Thread.sleep(5000);
        Assert.assertEquals(checkoutLapa.geterrorText(), "Error: First Name is required");

        System.out.println("6.Pārbaudīt, ka forma parāda pareizu kļūdas paziņojumu pie katra neievadītā lauka");
        //kaut kā liekas kaut kas nav līdz galam izdarīts rindās zemāk....

        checkoutLapa.inputFirstName("Janis");
        checkoutLapa.inputLastName("");
        checkoutLapa.inputzipCode("");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.geterrorText(), "Error: Last Name is required");
        Thread.sleep(5000);

//        checkoutLapa.inputFirstName("");
//        checkoutLapa.inputLastName("Petersons");
//        checkoutLapa.inputzipCode("");
//        checkoutLapa.clickContinueButton();
//        Assert.assertEquals(checkoutLapa.geterrorText(),"Error: First Name is required");
//        Thread.sleep(5000);
//
//        checkoutLapa.inputFirstName("");
//        checkoutLapa.inputLastName("");
//        checkoutLapa.inputzipCode("LVLVLV");
//        checkoutLapa.clickContinueButton();
//        Assert.assertEquals(checkoutLapa.geterrorText(), "Error: First Name is required");
//        Thread.sleep(5000);

    }
}
