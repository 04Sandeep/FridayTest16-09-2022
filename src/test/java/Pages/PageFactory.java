package Pages;

import org.openqa.selenium.WebDriver;
public class PageFactory
{

    WebDriver driver;


    private AddToCartNoteBookItem addToCartNoteBookItem;
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
}

}
