package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {


 WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    protected By
    changeLngButton = By.xpath("//*[@id=\"__next\"]/header/div[3]/div/div[2]/a/div/span"),
    acceptButton = By.xpath("//*[@id=\"portal-root\"]/div/div/div/div/button"),
    chatButton =By.xpath("//*[@id=\"zsiq_float\"]/img");
//    LoginButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]"),
//
//    emailField = By.name("email"),
//    passwordField = By.id("signin-password"),
//
//    signInButton = By.xpath ("//*[@id=\"portal-root\"]/div[2]/div/div/form/button[2]");

    @Step("clickLangBtn")
    public MainPage clickLangBtn(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(changeLngButton)).click();
        return this;
    }
    @Step("clickAccBtn")
    public MainPage clickAccBtn(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.elementToBeClickable(acceptButton)).click();
        return this;
    }
    @Step("clickToChat")
    public MainPage clickToChat(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        wait.until(ExpectedConditions.elementToBeClickable(chatButton)).click();
        return this;
    }




//    public MainPage clickLogInButton () throws InterruptedException{
//        driver.findElement(LoginButton).click();
//        Thread.sleep(2000);
//        return this;
//    }
//
//
//
//    public MainPage enterValidEmail(String correctEmailData) throws InterruptedException{
//        driver.findElement(emailField).sendKeys(correctEmailData);
//        Thread.sleep(2000);
//        return this;
//
//    }
//    public MainPage enterValidPassword(String correctPasswordData) throws InterruptedException{
//        driver.findElement(passwordField).sendKeys(correctPasswordData);
//        Thread.sleep(2000);
//        return this;
//
//    }
//    public MainPage clickSignInBtn() throws InterruptedException{
//        driver.findElement(signInButton).click();
//        Thread.sleep(2000);
//        return this;
//
//    }















}
