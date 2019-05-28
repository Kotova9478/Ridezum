import com.m2.ikea.CreateProfilePage;
import com.m2.ikea.HomePageIkea;
import com.m2.ikea.LoginPageIkea;
import com.m2.ikea.helper.UserIkea;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class BaseTestIkea {
    //https://m2.ikea.com/us/en/
    protected WebDriver driver;


    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/lesia/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://m2.ikea.com/us/en/");
        //String titleExpected = "Welcome to IKEA US";
      //  String titleActual = driver.getTitle();
      //  Assert.assertTrue(titleExpected.equals(titleActual));


    }
}
