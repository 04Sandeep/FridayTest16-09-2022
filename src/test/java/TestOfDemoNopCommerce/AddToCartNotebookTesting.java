package TestOfDemoNopCommerce;

import org.testng.annotations.Test;

public class AddToCartNotebookTesting extends BaseClass{

    @Test

    public void AddToCartNotebookTesting()
    {
        pageFactory.getAddToCartNoteBookItem().addToCartNoteBookItem();
    }
}
}
