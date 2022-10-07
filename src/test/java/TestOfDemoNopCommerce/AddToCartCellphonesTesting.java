package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class AddToCartCellphonesTesting extends BaseClass {

    @Test
    public void AddToCartCellphones()
    {
        pageFactory.getAddToCartCellphones().addToCartCellphones();
        pageFactory.getAddToCartCellphones().logout();
    }
    
}
