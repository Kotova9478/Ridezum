import org.junit.Test;
import org.openqa.selenium.By;

public class DriverTest extends RidezumBaseTest {
    private DriverPage driverPage;
    private HomePage homePage;
    private UserDriver userDriver;

    @Test
    public void testDriver(){

        homePage = new HomePage(driver);

        driverPage = homePage.clickApplayButton();

        DriverPage driverPage = new DriverPage(driver);

        userDriver = new UserDriver();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        driverPage.inputfirstNameField(userDriver.getFirstName());
        driverPage.inputLastNameField(userDriver.getLastName());
        driverPage.inputemailField(userDriver.getEmail());
        driverPage.inputIncorrectEmailField(userDriver.getIncorrectEmail());
        driverPage.inputPhoneField(userDriver.getPhoneNumber());
        driverPage.selectRegion();
        driverPage.inputZipCodeField(userDriver.getZipCode());
        driverPage.inputRefferalCodeField(userDriver.getRefferalCode());

        //swtch out from iframe
        driver.switchTo().defaultContent();

        driverPage.submitButton();
    }



}
