package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class AddBooksToCartTesting extends BaseClass{
    @Test
    public void AddBooksToCart()
    {
        pageFactory.getAddBooksToCart().addBooksToCart();
        pageFactory.getAddBooksToCart().logout();
    }
}
