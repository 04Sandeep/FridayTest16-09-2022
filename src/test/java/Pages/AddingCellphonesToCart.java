package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class AddingCellphonesToCart
{

    WebDriver driver;
    WebDriverWait wait;

    By clickonElectronics = By.xpath("//a[contains(text(),'Electronics')]");
    By clickonitem = By.xpath("//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]");
    By clickonCellphones = By.xpath("//a[@title = 'Show products in category Cell phones']");
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

    public AddingCellphonesToCart(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void addingCellphonesToCart() throws IOException
    {

        path = System.getProperty("user.dir")+"//src/test/java/TestData//TestData.xlsx";
        FileInputStream prop1 = null;
        try{
            prop1 = new FileInputStream(path);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String  pwd = sheet.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys(username);
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        //Assert.assertEquals(driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText(), "Dashboard");


        Assert.assertEquals(driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText(), "Welcome to our store");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickonElectronics));
        driver.findElement(clickonElectronics).click();
        driver.findElement(clickonCellphones).click();
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


