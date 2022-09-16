package Pages;

import org.openqa.selenium.WebDriver;
public class PageFactory
{

       WebDriver driver;

       private AddComputerItemToCartPage addComputerItemToCartPage;
       private SearchingPage searchingPage;
       private  AddingCellphonesToCart addingCellphonesToCart;
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

    public SearchingPage getSearchingPage()
    {
        if(searchingPage==null)
        {
            searchingPage= new SearchingPage(driver);
        }
        return searchingPage;
    }

    public AddingCellphonesToCart getAddingCellphonesToCart()
    {
        if(addingCellphonesToCart==null)
        {
            addingCellphonesToCart= new AddingCellphonesToCart(driver);
        }
        return addingCellphonesToCart;
    }
}
