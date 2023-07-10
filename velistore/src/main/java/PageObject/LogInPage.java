package PageObject;

import com.codeborne.selenide.Clipboard;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage {

    private static WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }



    protected By
       emailField = By.name("email");
    protected By passwordField = By.id("signin-password");

    protected By logInButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]");
    protected By logInButton2 = By.xpath ("//*[@id=\"portal-root\"]/div[2]/div/div/form/button[2]");
    protected By resetPassword = By.className("update-password");
    protected By resetPasswordInput = By.id("signin-password");
    protected By sendButton = By.xpath("//*[@id=\"portal-root\"]/div[2]/div/div/div/form/button");

   public By expectedErrorMessage = By.xpath("//*[@id=\"portal-root\"]/div/div/div/div[1]");


    public LogInPage clickLogInBtn() throws InterruptedException{
        driver.findElement(logInButton).click();
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.elementToBeClickable(logInButton)).click();
        Thread.sleep(2000);
        return this;


    }
public LogInPage ErrorMessage() throws InterruptedException{
        driver.findElement(expectedErrorMessage);
        Thread.sleep(2000);
        return this;
}
@Step("enterValidEmail")
    public LogInPage enterValidEmail(String correctEmailData) throws InterruptedException{
        driver.findElement(emailField).sendKeys(correctEmailData);
        Thread.sleep(2000);
        return this;

    }
    @Step("enterValidPassword")
    public LogInPage enterValidPassword(String correctPasswordData) throws InterruptedException{
        driver.findElement(passwordField).sendKeys(correctPasswordData);
        Thread.sleep(2000);
        return this;

    }
@Step("clickSignInBtn")
    public LogInPage clickSignInBtn() throws InterruptedException{
        driver.findElement(logInButton2).click();
        Thread.sleep(2000);
        return this;

    }

@Step("resetPassword")
    public LogInPage resetPassword() throws InterruptedException {
        driver.findElement(resetPassword).click();


        Thread.sleep(2000);
        return this;



    }
@Step("resetPasswordField")
    public LogInPage resetPasswordField (String correctEmailData) throws InterruptedException{
        driver.findElement(resetPasswordInput).sendKeys( correctEmailData);
        Thread.sleep(2000);
        return this;
    }
    @Step("enterSendButton")
    public LogInPage enterSendButton(WebDriver driver) throws InterruptedException {
        driver.findElement(sendButton).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
      Thread.sleep(2000);
        return this;
    }




    }


