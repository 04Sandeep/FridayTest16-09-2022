package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class AddJeweleryToCartTesting extends BaseClass{

    @Test

    public void AddJeweleryToCart()
    {
           pageFactory.getAddJewelryToCart().addJewelryToCart();
           pageFactory.getAddJewelryToCart().logout();
    }
}
