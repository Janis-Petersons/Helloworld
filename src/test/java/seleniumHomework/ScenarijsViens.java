package seleniumHomework;

import pageObjectsHomework.pageObjects.*;
//import lekcijaAstoni.pageObjects.*;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScenarijsViens extends BaseTest {
    @Test

    public void testdarbibas() throws InterruptedException {
        System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/"); //Base tests augšā jau palaiž pārlūku

        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginlapa = new LoginPage(parluks);
        loginlapa.login("standard_user", "secret_sauce"); //Login page ir definēts kas un kur jāievada šī info

        System.out.println("3. Pārbaudīt, ka lietotājs ir ielogojies");
        ProductsPage produktuLapa = new ProductsPage(parluks);
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");  //salīdzinam vai iegūtā info no lapas ir vienādā ar PRODUCTS


        System.out.println("4. Ievietot Grozā 1 produktu");
        produktuLapa.getaddProducttoCart().click(); //kas ir zem product to cart definējām page objectd


        System.out.println("5. Doties uz grozu"); //Products page bija definēts objekts grozs šeit palaižu lai noklikšķina uz tās

        produktuLapa.getCartButton().click();

        System.out.println("6. Pārbaudīt, kā šī prece ir grozā");
        CartPage grozaLapa= new CartPage(parluks);
        Assert.assertEquals(grozaLapa.getProductName().getText(), "Sauce Labs Bike Light"); //jāatrod pēc nosaukuma
        Assert.assertEquals(grozaLapa.getcartElementQnt().getText(), "1"); //jāatrod viena prece


        System.out.println("7. Doties uz Checkout");
        grozaLapa.getCheckoutButton().click(); //augstāk definēju kas ir zem grozaLapa, ar šo spiežam pogu


        System.out.println("8. Ievadīt vārdu/uzvārdu/pasta indeksu");
        CheckoutPage checkoutLapaInfo = new CheckoutPage(parluks);
        checkoutLapaInfo.inputFirstName("Janis");
        checkoutLapaInfo.inputLastName("Petersons");
        checkoutLapaInfo.inputzipCode("LV-2100");
        Thread.sleep(5000);

        System.out.println("9. Doties uz Checkout overview lapu, pārbaudīt datus");
        checkoutLapaInfo.clickContinueButton();
        CheckoutOverview checkoutlapa = new CheckoutOverview(parluks);
        Assert.assertEquals(checkoutlapa.getcheckTitle().getText(),"CHECKOUT: OVERVIEW");
        Assert.assertEquals(checkoutlapa.getdoubleCheckProductName().getText(),"Sauce Labs Bike Light");
        Thread.sleep(5000);

        System.out.println("10. Doties uz finish lapu un pārbaudīt vai viss bija veiksmīgi");
        checkoutlapa.getfinishButton().click();

        CheckoutComplete checkoutcompletelapa = new CheckoutComplete(parluks);
        Assert.assertEquals(checkoutcompletelapa.getcheckoutPageTitle().getText(),"CHECKOUT: COMPLETE!");
        Thread.sleep(5000);

//        System.out.println("11. Doties atpakaļ uz pirmo lapu ar pogu 'Back Home'"); Es nesaprotu kāpēc nestrādā....
//        CheckoutComplete jaunachecklapa = new CheckoutComplete(parluks);
//        jaunachecklapa.clickPressBackHomeButton();
//        Thread.sleep(5000);

    }
}