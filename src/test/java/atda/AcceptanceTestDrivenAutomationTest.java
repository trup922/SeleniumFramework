package atda;

import org.junit.Test;
import pages.LoginPage;
import pages.ProductsPage;
import static org.junit.Assert.assertTrue;


public class AcceptanceTestDrivenAutomationTest extends BaseTest{


    @Test
    public void shouldOpen(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
    }
    @Test
    public void shouldlogin(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.open();
        assertTrue(loginPage.isLoaded());
        loginPage.login("standard_user","secret_sauce");
        assertTrue(new ProductsPage(driver).isLoaded());
    }


}
