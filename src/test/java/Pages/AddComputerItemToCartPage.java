package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddComputerItemToCartPage
{

    WebDriver driver;

    By clickOnComputer = By.xpath("//a[contains(text(), 'Computers')]");
    By clickOnNotebooks = By.xpath("//a[@title = 'Show products in category Notebooks']");
    By clickOnAddToCart = By.xpath("//button[@class = 'button-2 product-box-add-to-cart-button']");
    By clickOnAddCartItem = By.xpath("//button[@class = 'button-1 add-to-cart-button']");
    By clickOnShoppingCart = By.xpath("//span[contains(text(), 'Shopping cart')]");
    By clickOnTerms = By.xpath("//input[@name = 'termsofservice']");
    By clickOnCheckout = By.xpath("//button[@name = 'checkout']");
    By clickOnRegister = By.xpath("//button[@class='button-1 register-button']");
    By selectFemale = By.xpath("//label[contains(text(),'Female')]");
    By addFirstName = By.xpath("//input[@name = 'FirstName']");
    By addLastName = By.xpath("//input[@Name = 'LastName']");
    By addDate = By.xpath("//select[@Name = 'DateOfBirthDay']");
    By addMonth = By.xpath("//select[@Name = 'DateOfBirthMonth']");
    By addyear = By.xpath("//select[@Name = 'DateOfBirthYear']");
    By addEmail = By.xpath("//input[@Name = 'Email']");
    By addCompany = By.xpath("//input[@Name = 'Company']");
    By addpassword = By.xpath("//input[@Name = 'Password']");
    By addConformPasword = By.xpath("//input[@Name = 'ConfirmPassword']");
    By register = By.xpath("//button[@Name = 'register-button']");
    By clickonContinue = By.xpath("//a[@class='button-1 register-continue-button']");
    By addCountry = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    By addstate = By.xpath("//select[@name='BillingNewAddress.StateProvinceId']");
    By enterCity = By.xpath("//input[@name = 'BillingNewAddress.City']");
    By enterAddress = By.xpath("//input[@name = 'BillingNewAddress.Address1']");
    By enterPostCode = By.xpath("//input[@name = 'BillingNewAddress.ZipPostalCode']");
    By enterPhoneNumber = By.xpath("//input[@name = 'BillingNewAddress.PhoneNumber']");
    By save = By.xpath("//button[@name = 'save']");
    By continuebutton = By.xpath("//button[@class = 'button-1 shipping-method-next-step-button']");
    By agiancontinue = By.xpath("//button[@class = 'button-1 payment-method-next-step-button']");
    By continueinfo = By.xpath("//button[@class = 'button-1 payment-info-next-step-button']");
    By confirm = By.xpath("//button[@class = 'button-1 confirm-order-next-step-button']");

    public AddComputerItemToCartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addComputerItemToCartPage()
    {

        driver.findElement(clickOnComputer).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Computers')]")).getText(), "Computers");
        driver.findElement(clickOnNotebooks).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Notebooks')]")).getText(), "Notebooks");
        driver.findElement(clickOnAddToCart).click();
        driver.findElement(clickOnAddCartItem).click();
        driver.findElement(clickOnShoppingCart).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Shopping cart')]")).getText(),"Shopping cart");
        driver.findElement(clickOnTerms).click();
        driver.findElement(clickOnCheckout).click();
        driver.findElement(clickOnRegister).click();
        driver.findElement(selectFemale).click();
        driver.findElement(addFirstName).sendKeys("Sandeep");
        driver.findElement(addLastName).sendKeys("Kaur");
        driver.findElement(addDate).sendKeys("4");
        driver.findElement(addMonth).sendKeys("October");
        driver.findElement(addyear).sendKeys("1994");
        driver.findElement(addEmail).sendKeys("sandeep42444@gmail.com");
        driver.findElement(addCompany).sendKeys("Infostride");
        driver.findElement(addpassword).sendKeys("Sandy@112");
        driver.findElement(addConformPasword).sendKeys("Sandy@112");
        driver.findElement(register).click();
        driver.findElement(clickonContinue).click();
        driver.findElement(clickOnTerms).click();
        driver.findElement(clickOnCheckout).click();
        driver.findElement(addCountry).sendKeys("Australia");
        driver.findElement(addCountry).sendKeys("Other");
        driver.findElement(enterCity).sendKeys("Mohali");
        driver.findElement(enterAddress).sendKeys("TDI City, Mohali");
        driver.findElement(enterPostCode).sendKeys("123300");
        driver.findElement(enterPhoneNumber).sendKeys("9998521470");
        driver.findElement(save).click();
        driver.findElement(continuebutton).click();
        driver.findElement(agiancontinue).click();
        driver.findElement(continueinfo).click();
        driver.findElement(confirm).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).getText(),"Thank you");
    }
}

