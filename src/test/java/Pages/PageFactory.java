package Pages;

import TestOfDemoNopCommerce.AddJeweleryToCartTesting;
import org.openqa.selenium.WebDriver;
public class PageFactory
{

    WebDriver driver;
    private AddToCartNoteBookItem addToCartNoteBookItem;
    private AddToCartCellphones addToCartCellphones;
    private AddShoesToCart addShoesToCart;
    private AddBooksToCart addBooksToCart;
    private AddJewelryToCart addJewelryToCart;
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

    public AddBooksToCart getAddBooksToCart() {
        if(addBooksToCart == null)
        {
            addBooksToCart = new AddBooksToCart();
        }
        return addBooksToCart;
    }

    public AddJewelryToCart getAddJewelryToCart() {

        if(addJewelryToCart == null)
        {
            addJewelryToCart = new AddJewelryToCart();
        }
        return addJewelryToCart;
    }
}




