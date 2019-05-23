import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobsPage extends BasePage {
    public JobsPage (WebDriver driver){
        super(driver);
    }
    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applayThisJob;
    // topButton[0];
    //        [1];

    public  ApplayPage clickApplayButton(){
       // wait.until(E)
        applayThisJob.get(0).click();
       return new ApplayPage(driver);



    }
}

