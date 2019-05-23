import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage{
    public CareersPage (WebDriver driver){
        super(driver);


    }
    @FindBy(css = ".m-btn.m-banner__btn")
    private WebElement viewJobs;

    public JobsPage clickViewJobs(){
       viewJobs.click();
       return new JobsPage(driver);

    }

}
