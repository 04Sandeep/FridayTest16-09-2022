package Pages;

import org.openqa.selenium.WebDriver;
public class PageFactory
{

    WebDriver driver;
    private AddToCartNoteBookItem addToCartNoteBookItem;
    private AddToCartCellphones addToCartCellphones;
    private AddShoesToCart addShoesToCart;
    public PageFactory(WebDriver driver)
    {
        this.driver = driver;
    }

    public AddToCartNoteBookItem getAddToCartNoteBookItem()
    {
        if(addToCartNoteBookItem==null)
        {
            addToCartNoteBookItem = new AddToCartNoteBookItem(driver);
        }
        return addToCartNoteBookItem;
    }

    public AddToCartCellphones getAddToCartCellphones()
    {
        if(addToCartCellphones==null)
        {
            addToCartCellphones = new AddToCartCellphones(driver);
        }
        return addToCartCellphones;
    }

    public AddShoesToCart getAddShoesToCart()
    {
        if(addShoesToCart == null);
        {
            addShoesToCart = new AddShoesToCart(driver);
        }
        return addShoesToCart;
    }
}


