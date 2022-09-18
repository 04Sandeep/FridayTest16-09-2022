package Pages;

import org.openqa.selenium.WebDriver;
public class PageFactory
{

    WebDriver driver;

    private AddComputerItemToCartPage addComputerItemToCartPage;
    private AddToCartNoteBookItem addToCartNoteBookItem;
    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }
    public AddComputerItemToCartPage getAddComputerItemToCartPage()
    {
        if(addComputerItemToCartPage==null)
        {
            addComputerItemToCartPage = new AddComputerItemToCartPage(driver);
        }
        return addComputerItemToCartPage;
    }

    public AddToCartNoteBookItem getAddToCartNoteBookItem()
    {
        if(addToCartNoteBookItem==null)
        {
            addToCartNoteBookItem = new AddToCartNoteBookItem(driver);
        }
        return addToCartNoteBookItem;
    }
}

}
