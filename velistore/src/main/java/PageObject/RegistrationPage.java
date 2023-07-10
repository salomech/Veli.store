package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class RegistrationPage {

   private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }





           By logInButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]");
          By  regButton = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/span/button[2]");
          By  emailField = By.name("email");
         By   nameField = By.id("username");
          By  phoneNumber = By.id("phone");

          By  passwordField = By.id("signup-password");
          By  replayPasswordField = By.id("signup-password-repeat");

          By  createAccount = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/form/button[1]");

//          By changeLang = By.xpath("//*[@id=\"__next\"]/header/div[3]/div/div[2]/a/div");
@Step("clickLgnPage")

public RegistrationPage clickLgnPage() throws InterruptedException{
     driver.findElement(logInButton).click();
     Thread.sleep(2000);
     return this;

    }
    @Step("clickRegPage")

    public RegistrationPage clickRegPage() throws InterruptedException{
        driver.findElement(regButton).click();
        Thread.sleep(2000);
        return  this;
    }


    @Step("enterValidEmailAddress")

    public RegistrationPage enterValidEmailAddress(String correctEmailData) throws InterruptedException {
        driver.findElement(emailField).sendKeys(correctEmailData);
        return this;
    }
    @Step("enterValidName")

    public RegistrationPage enterValidName (String UsernameData) throws InterruptedException {
        driver.findElement(nameField).sendKeys(UsernameData);
        return this;
    }
    @Step("enterValidPhoneNumber")

    public RegistrationPage enterValidPhoneNumber (String PhoneNumberData) throws InterruptedException {
        driver.findElement(phoneNumber).sendKeys(PhoneNumberData);
        return this;
    }
    @Step("enterPassword")

    public RegistrationPage enterPassword (String NewPassword) throws InterruptedException {
        driver.findElement(passwordField).sendKeys(NewPassword);
        return this;
    }
    @Step("reenterPassword")

    public RegistrationPage reenterPassword (String RewritePassword) throws InterruptedException {
        driver.findElement(replayPasswordField).sendKeys(RewritePassword);
        return this;
    }
    @Step("clickCreateBtn")


    public RegistrationPage clickCreateBtn() throws InterruptedException{
        driver.findElement(createAccount).click();
        Thread.sleep(2000);
        return this;

    }
//    public RegistrationPage clickLangBtn() throws InterruptedException{
//        driver.findElement(changeLang).click();
//        Thread.sleep(2000);
//        return this;
//
//    }
}





