package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchingPage
{

    WebDriver driver;

    By search = By.xpath("//input[@class = 'search-box-text ui-autocomplete-input']");
    By clickonSearch = By.xpath("//button[@class = 'button-1 search-box-button']");

    public SearchingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchingPage() {
        driver.findElement(search).sendKeys("Computers");
        driver.findElement(clickonSearch).click();
    }
}

