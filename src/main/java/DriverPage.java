import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class DriverPage extends BasePage {

    public DriverPage(WebDriver driver){
        super(driver);
    }

  //  @FindBy(css = "")
   // private WebElement tellAboutYourselfField;

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement regionSelectButton;

    @FindBy(css = "#application_form_zipcode")
    private WebElement zipCodeField;

    @FindBy(css = "#application_form_refcode")
    private WebElement refferalCodeField;

    @FindBy(css = ".btn-apply.js-submit.app-apply-button.application-form__submit-button")
    private WebElement submitButton;


    // public void tellUsAboutYourselfField(){
        //wait.until(ExpectedConditions.elementToBeClickable(tellUsAboutYourselfField));
       // tellAboutYourselfField.sendKeys();
    //}
     public void inputfirstNameField(String firstName){
        //wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }
    public void inputLastNameField(String lastName) {
        //wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }
    public void inputemailField(String email) {
        //wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }
    public void inputIncorrectEmailField(String incorrectEmail){
         wait.until(ExpectedConditions.elementToBeClickable(emailField));
         emailField.sendKeys(incorrectEmail);
    }
    public void inputPhoneField(String phone) {
        //wait.until(ExpectedConditions.elementToBeClickable(phoneField));
        phoneField.sendKeys(phone);
    }
  //  public void selectRegion() {

        //wait.until(ExpectedConditions.elementToBeClickable(regionSelectButton));

       // Select select = new Select(regionSelectButton);
        //select.selectByIndex(1);
   // }
    public void selectRandomRegion() {
        // wait.until(ExpectedConditions.elementToBeClickable(regionSelectButton));
      Select selectRandom = new Select(regionSelectButton);
      int index = 0;
      Random random = new Random();
      random.nextInt(6);
      if (index == 0){
          index = 1;
      }
        System.out.println(index);
      selectRandom.selectByIndex(index);
    }
        public void inputZipCodeField(String zipCode) {
        //wait.until(ExpectedConditions.elementToBeClickable(zipCodeField));
        zipCodeField.sendKeys(zipCode);

    }
    public void inputRefferalCodeField(String refferalCode) {
        //wait.until(ExpectedConditions.elementToBeClickable(refferalCodeField));
        refferalCodeField.sendKeys(refferalCode);

    }
    public SubmitWindow submitButton(){

        submitButton.click();

        return  new SubmitWindow();

    }
}
