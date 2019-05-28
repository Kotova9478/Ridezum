import com.m2.ikea.CreateProfilePage;
import com.m2.ikea.HomePageIkea;
import com.m2.ikea.LoginPageIkea;
import com.m2.ikea.helper.UserIkea;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class IkeaLoginTest extends BaseTestIkea {
    private HomePageIkea homePageIkea;
    private HomePage homePage;
    private LoginPageIkea loginPageIkea;
    private CreateProfilePage createProfilePage;
    private UserIkea userIkea;

   // @Test
    public void testIkeaLogin(){

        homePageIkea = new HomePageIkea(driver);

        loginPageIkea = new LoginPageIkea(driver);

        loginPageIkea = homePageIkea.clickButton();

       // driver.switchTo().frame("https://securem.ikea.com/us/en/login/");

        createProfilePage = new CreateProfilePage(driver);

        createProfilePage = loginPageIkea.clickCreateButton();


       // driver.switchTo().frame("https://securem.ikea.com/us/en/login/create/");

        userIkea = new UserIkea();


       createProfilePage.inputNameField(userIkea.getName());
       createProfilePage.lastNameField(userIkea.getLastName());
       createProfilePage.inputPhoneField(userIkea.getPhoneNumber());
       createProfilePage.inputEmailField(userIkea.getEmail());
       createProfilePage.inputRepeatEmailField(userIkea.getRepetEmail());
       createProfilePage.inputPasswordField(userIkea.getPassword());
       createProfilePage.inputRePasswordField(userIkea.getRePassword());
      // createProfilePage.clickSubmit();
       //createProfilePage.captchaIdField(userIkea.);
      // createProfilePage.inputcaptchaInputField(userIkea.);
       //createProfilePage.createProfileButton();

    }
}
