import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

    public class RidezumBaseTest {

    protected WebDriver driver;
   // protected UserDriver userDriver;
   // protected HomePage homePage;
       // protected WebDriverWait wait;

        @Before
        public void setDriver() {
            System.setProperty("webdriver.chrome.driver",
                    "/Users/lesia/Downloads/chromedriver");

             driver = new ChromeDriver();
             driver.get("https://ridezum.com");
            String titleExpected = "Zum | Rides for kids, After School Care";
            String titleActual = driver.getTitle();
            //Assert.assertTrue(titleExpected.equals(titleActual));

          //  wait = new WebDriverWait(driver, 10);


        }

           // userDriver = new UserDriver();
          //homePage = new HomePage(driver);
       // wait = new WebDriverWait(driver, 10);

        @After
         public void close(){
       // driver.quit();
    }
}