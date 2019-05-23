import helper.UserMassives;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class DriverTest extends RidezumBaseTest {
    private DriverPage driverPage;
    private HomePage homePage;
    private UserDriver userDriver;
    private static Logger log = Logger.getLogger(DriverTest.class.getName());

    @Test
    public void testDriver(){

        homePage = new HomePage(driver);

        driverPage = homePage.clickApplayButton();

        DriverPage driverPage = new DriverPage(driver);

        userDriver = new UserDriver();
       UserMassives userMassives = new UserMassives();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

       // driverPage.inputfirstNameField(userDriver.getFirstName());
        driverPage.inputfirstNameField(userMassives.randomFirstName());
        driverPage.inputLastNameField(userDriver.getLastName());
        driverPage.inputemailField(userDriver.getEmail());
        driverPage.inputIncorrectEmailField(userDriver.getIncorrectEmail());
        driverPage.inputPhoneField(userDriver.getPhoneNumber());
       // driverPage.selectRegion();
        driverPage.selectRandomRegion();
        driverPage.inputZipCodeField(userDriver.getZipCode());
        driverPage.inputRefferalCodeField(userDriver.getRefferalCode());

        log.info("Driver switched to the new window");

        //swtch out from iframe
       // driver.switchTo().defaultContent();

        driverPage.submitButton();
    }



}
