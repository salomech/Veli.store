package PageObject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
                 By
                         scrollButton = By.xpath("//*[@id=\"__next\"]/div[2]/div/section[1]/div/div/div/div[2]/span"),
                      categoryButton = By.xpath("//*[@id=\"__next\"]/div[2]/div/section[1]/div/div/div/div[3]/div/div[4]/a/div"),

                      fullButton = By.xpath("//*[@id=\"__next\"]/section/div/div[4]/div[2]/section[1]/div[1]/a[2]"),
                      productButton = By.xpath("//*[@id=\"__next\"]/section/div/div[3]/div[4]/div[2]"),
                      addToWishlistBtn = By.className("wishlist-btn"),
                      emailField = By.name("email"),
                      passwordField = By.id("signin-password"),
                      signInButton = By.xpath ("//*[@id=\"portal-root\"]/div[2]/div/div/form/button[2]"),

                      myVeliButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]"),

                      myWishList = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[6]/div[2]/button[2]/a")  ,
                      allCategoryButton= By.className("menu"),
                      chooseCategory =By.xpath("//*[@id=\"__next\"]/header/div[4]/div[2]/div/div/div[2]/button[13]"),
                      choosenCategory =By.xpath("//*[@id=\"__next\"]/header/div[4]/div[2]/div/div/div[2]/div/a[4]"),
                      choosenProduct = By.xpath("//*[@id=\"__next\"]/section/div/div[4]/div[4]/div[10]")
    ;

//    public ProductPage clickScroll() throws InterruptedException{
//        driver.findElement(scrollButton).click();
//        Thread.sleep(2000);
//        return this;
//
//    }

    @Step("clickGifts")
    public ProductPage clickGifts() throws InterruptedException{
        driver.findElement(categoryButton).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("clickFull")

    public ProductPage clickFull() throws InterruptedException{
        driver.findElement(fullButton).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("clickProduct")

    public ProductPage clickProduct() throws InterruptedException{
        driver.findElement(productButton).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("clickWishList")

    public ProductPage clickWishList() throws InterruptedException{
        driver.findElement(addToWishlistBtn).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("enterValidEmail")

    public ProductPage enterValidEmail(String correctEmailData) throws InterruptedException{
        driver.findElement(emailField).sendKeys(correctEmailData);
        Thread.sleep(2000);
        return this;

    }
    @Step("enterValidPassword")

    public ProductPage enterValidPassword(String correctPasswordData) throws InterruptedException{
        driver.findElement(passwordField).sendKeys(correctPasswordData);
        Thread.sleep(2000);
        return this;

    }
    @Step("clickSignInBtn")

    public ProductPage clickSignInBtn() throws InterruptedException{
        driver.findElement(signInButton).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("clickMyVeli")

    public ProductPage clickMyVeli() throws InterruptedException{
        driver.findElement(myVeliButton).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("clickMyWishlist")

    public ProductPage clickMyWishlist() throws InterruptedException{
        driver.findElement(myWishList).click();
        Thread.sleep(2000);
        return this;

    }
    @Step("clickAllCategoryPr")

    public ProductPage clickAllCategoryPr() throws InterruptedException{
        driver.findElement(allCategoryButton).click();
        Thread.sleep(2000);
        return this;
    }
    @Step("clickToChooseCategory")

    public ProductPage clickToChooseCategory() throws InterruptedException{
        driver.findElement(chooseCategory).click();
        Thread.sleep(2000);
        return this;
    }
    @Step("clickToSeeProducts")

    public ProductPage clickToSeeProducts() throws InterruptedException{
        driver.findElement(choosenCategory).click();
        Thread.sleep(2000);
        return this;
    }
    @Step("scrollToElement")

//    public ProductPage chooseProduct() throws InterruptedException{
//        driver.findElement(chooseProductButton).click();
//        Thread.sleep(2000);
//        return this;
//    }
    public ProductPage scrollToElement() throws InterruptedException {
        JavascriptExecutor jsExucutor = (JavascriptExecutor) driver;
        jsExucutor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(choosenProduct));
        Thread.sleep(2000);
        return this;
    }


}
