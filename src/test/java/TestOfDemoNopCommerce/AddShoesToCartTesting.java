package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class AddShoesToCartTesting extends BaseClass{

    @Test
    public void AddShoesToCart()
    {
        pageFactory.getAddShoesToCart().addShoesToCart();
        pageFactory.getAddShoesToCart().logout();
    }
}
