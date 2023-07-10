import DataObject.LogInData;
import PageObject.LogInPage;

import Utiles.Chromerunner;
import io.qameta.allure.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;


public class LoginTest extends Chromerunner {
    LogInPage page = new LogInPage(driver);

    @Test(priority = 1,groups = "IncorrectResult")
    @Severity(SeverityLevel.CRITICAL)
    @Description("log in with incorrect data and compare actual and expected results")

    public void logInWithIncorrectData() throws InterruptedException {

        page
                .clickLogInBtn()
                .enterValidEmail(incorrectEmailData)
                .enterValidPassword(incorrectPasswordData)
                .clickSignInBtn();

         String actualResult = driver.findElement(page.expectedErrorMessage).getText();

         Assert.assertEquals(actualResult,expectedResult);

    }


    @Test (priority = 3,groups = "correctResult")
    @Severity(SeverityLevel.CRITICAL)
    @Description("log in with correct data and see if user can log in")
        public void logInWithCorrectData () throws InterruptedException {

        page


                .clickLogInBtn()
                .enterValidEmail(correctEmailData)
                .enterValidPassword(correctPasswordData)
                .clickSignInBtn();
            Thread.sleep(6000);

        }
        @Test (priority = 2,groups = "IncorrectResult")
        @Severity(SeverityLevel.CRITICAL)
        @Description("reset password with email and  send fake incorrect email data and see is error is displayed")
    public void ResetAccount () throws InterruptedException {

        page
                .clickLogInBtn()
                .resetPassword()
                .resetPasswordField(fakeEmail)
                .enterSendButton(driver);

        }



}

