import org.junit.Test;

public class JobsTest extends RidezumBaseTest{
    protected HomePage homePage;
    protected CareersPage careersPage;
    protected JobsPage jobsPage;

  //  @Test
    public void testJobs(){
        homePage.clickCareerButton();
        careersPage.clickViewJobs();
        jobsPage.clickApplayButton();


    }
}

