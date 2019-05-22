import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage {
    public  HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".front-banner__btns a:nth-child(2)")
    private WebElement homePageButtons;
    //solutionsForSchool[0];
    // applayDriver[1];
    //              [2];
    //              [3];
    //              [4];
    @FindBy (css = ".main-menu__link")
    private List<WebElement> homeTopButtons;
    //careers [4];

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> ApplayButtons;
    //backandEngineer [1];
    



    public DriverPage clickApplayButton(){
        wait.until(ExpectedConditions.elementToBeClickable(homePageButtons));
        homePageButtons.click();

        return new DriverPage(driver);

    }
    public CareersPage clickCareerButton(){
        wait.until(ExpectedConditions.elementToBeClickable(homeTopButtons.get(4)));
        homePageButtons.click();
        return new CareersPage(driver);
    }

    //public DriverPage clickDriverButton(){
       // homePageButtons.get(1).click();
       // return new DriverPage();
    }



