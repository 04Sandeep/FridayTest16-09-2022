package TestOfDemoNopCommerce;

public class AddingCellphoneTesting extends BaseClass{

    @Test
    public void AddingCellphonesToCart()
    {
        pageFactory.getAddingCellphonesToCart().addingCellphonesToCart();
        pageFactory.getAddingCellphonesToCart().logout();
    }
}

