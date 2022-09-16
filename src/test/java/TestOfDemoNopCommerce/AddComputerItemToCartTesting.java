package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class AddComputerItemToCartTesting extends BaseClass {

    @Test

    public void AddComputerItemToCartPage()
    {
        pageFactory.getAddComputerItemToCartPage().addComputerItemToCartPage();
    }
}
