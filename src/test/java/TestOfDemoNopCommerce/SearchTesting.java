package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class SearchTesting extends BaseClass
{

    @Test

    public void SearchingPage()
    {
        pageFactory.getSearchingPage().searchingPage();
    }
}
