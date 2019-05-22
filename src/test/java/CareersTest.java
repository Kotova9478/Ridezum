import org.junit.Test;

public class CareersTest extends RidezumBaseTest {
    protected HomePage homePage;
    protected CareersPage careersPage;

    @Test
    public void testCareers() {

        homePage = new HomePage(driver);
        careersPage = homePage.clickCareerButton();
    }
}

