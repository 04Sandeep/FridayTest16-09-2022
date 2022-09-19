package Pages;

import org.testng.Assert;

import java.time.Duration;

public class AddBooksToCart {

    WebDriver driver;
    WebDriverWait wait;

    By clickonLogin = By.xpath("//a[contains(text(),'Log in')]");
    By enterEmail = By.xpath("//input[@class='email']");
    By enterPassword = By.xpath("//input[@class='password']");
    By clickLoginButton = By.xpath("//button[@class='button-1 login-button']");
    By clickonBooks= By.xpath("//a[contains(text(),'Books)]");
    By clickonitem = By.xpath("//a[contains(text(),'First Prize Pies')]");
    By clickOnAddToCart = By.xpath("//button[@class = 'button-2 product-box-add-to-cart-button']");
    By clickOnAddCartItem = By.xpath("//button[@class = 'button-1 add-to-cart-button']");
    By clickOnShoppingCart = By.xpath("//span[contains(text(), 'Shopping cart')]");
    By clickOnTerms = By.xpath("//input[@name = 'termsofservice']");
    By clickOnCheckout = By.xpath("//button[@name = 'checkout']");
    By save = By.xpath("//button[@name = 'save']");
    By continuebutton = By.xpath("//button[@class = 'button-1 shipping-method-next-step-button']");
    By agiancontinue = By.xpath("//button[@class = 'button-1 payment-method-next-step-button']");
    By continueinfo = By.xpath("//button[@class = 'button-1 payment-info-next-step-button']");
    By confirm = By.xpath("//button[@class = 'button-1 confirm-order-next-step-button']");

    public AddShoesToCart(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void addBooksToCart()
    {

        driver.findElement(clickonLogin).click();
        driver.findElement(enterEmail).sendKeys("sandeep12345678@gmail.com");
        driver.findElement(enterPassword).sendKeys("Sandy@112");
        driver.findElement(clickLoginButton).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText(), "Welcome to our store");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonApparel));
        driver.findElement(clickonBooks).click();
        driver.findElement(clickonitem).click();
        driver.findElement(clickOnAddToCart).click();
        driver.findElement(clickOnAddCartItem).click();
        driver.findElement(clickOnShoppingCart).click();
        driver.findElement(clickOnTerms).click();
        driver.findElement(clickOnCheckout).click();
        driver.findElement(save).click();
        driver.findElement(continuebutton).click();
        driver.findElement(agiancontinue).click();
        driver.findElement(continueinfo).click();
        driver.findElement(confirm).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).getText(),"Thank you");

    }
    public void logout()
    {
        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
    }
}


}

        }
