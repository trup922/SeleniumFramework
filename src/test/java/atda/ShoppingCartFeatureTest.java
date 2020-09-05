package atda;

import org.junit.Test;
import pages.ProductsPage;
import pages.ShoppingCartPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartFeatureTest extends BaseTest{

    @Test
    public void shouldHaveItemInCartPage(){
      ShoppingCartPage cartPage=new ShoppingCartPage(driver);
      cartPage.open();
      cartPage.injectItemIntoCart();
        assertEquals("Added one item into cart and expected 1 item in cart page",1,
                new ShoppingCartPage(driver).getItemCount());
    }

    @Test
    public void shouldbeAbleToAddItemInCart(){
        ProductsPage productsPage=new ProductsPage(driver);
        productsPage.open();
        assertTrue(productsPage.isLoaded());
        productsPage.Inventory.addRandomItemToCart();
        assertTrue("We added a single item into cart and expected that cart to have 1 item",
                productsPage.ShoppingCart.hasItems(1));
    }
}
