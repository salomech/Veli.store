import PageObject.MainPage;
import Utiles.Chromerunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;
import static DataObject.MainData.*;
public class MainTest extends Chromerunner

{


    @Test(priority = 2, groups = "noData")
    @Severity(SeverityLevel.MINOR)
    @Description("change site language")
    public void changeLng() throws InterruptedException{
        MainPage page = new MainPage(driver);

page
        .clickLangBtn(driver);

    }



    @Test(priority = 1,groups = "noData")
    @Severity(SeverityLevel.MINOR)
    @Description("accept to all site cookies and click chat")
    public void clickToAcc () throws InterruptedException {
        MainPage page = new MainPage(driver);
        page
                .clickAccBtn(driver)
                .clickToChat(driver);
    }





//@Test
//    public void logIn() throws InterruptedException{
//        MainPage page = new MainPage(driver);
//
//        page
//                .clickLogInButton()
//                .enterValidEmail(correctEmailData)
//                .enterValidPassword(correctPasswordData)
//                .clickSignInBtn();
//
//
//
//
//    }


}
