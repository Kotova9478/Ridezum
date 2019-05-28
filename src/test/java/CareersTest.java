import org.junit.Test;

public class CareersTest extends RidezumBaseTest {
    protected HomePage homePage;
    protected CareersPage careersPage;

   // @Test
    public void testCareers() {

        homePage = new HomePage(driver);
        careersPage = homePage.clickCareerButton();

        // methotd for REMEMBER PREVIOUS WINDOW
        String windowHandleBefore = driver.getWindowHandle();
//method RETURN PREVIOUS  WINDOW
      //  driver.switchTo().window(windowHandleBefore);

     //SWITCH TO NEW WINDOW
        for(String winHandle: driver.getWindowHandles()){

            driver.switchTo().window(winHandle);
        }





    }
}


