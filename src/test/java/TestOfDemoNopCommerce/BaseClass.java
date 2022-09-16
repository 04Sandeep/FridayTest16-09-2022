package TestOfDemoNopCommerce;

import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.time.Duration;

public class BaseClass
{

    protected static PageFactory pageFactory;
    public static WebDriver driver;

    @Parameters("browserName")
    @BeforeClass

    public static void setup(String browserName)
    {

        if (browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.navigate().to("https://demo.nopcommerce.com/");
            pageFactory = new PageFactory(driver);
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://demo.nopcommerce.com/");
            pageFactory = new PageFactory(driver);
        }
    }
  @AfterClass
    public void close()
    {
        driver.close();
    }
}


