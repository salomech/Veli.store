import PageObject.RegistrationPage;
import Utiles.Chromerunner;
import static DataObject.RegistrationData.*;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;


public class Registration extends Chromerunner {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("click login page and enter valid data to create account")
   public void validRegistration() throws InterruptedException {
        RegistrationPage page = new RegistrationPage(driver);
        page
                .clickLgnPage()

                .clickRegPage()

                .enterValidEmailAddress(emailData)

                .enterValidName(name)

                .enterValidPhoneNumber(phoneNumberData)

                .enterPassword(passwordData)

                .reenterPassword(replayPasswordData)

                .clickCreateBtn();

//                        .clickLangBtn();


        Thread.sleep(6000);



    }




}
