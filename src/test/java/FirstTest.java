import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends RidezumBaseTest {
        private HomePage homePage;
         @Test
         public void testFirst() {

             homePage = new HomePage(driver);
             homePage.clickApplayButton();



         }
}
