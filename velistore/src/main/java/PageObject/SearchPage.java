package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    protected   By
    searchButton = By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[2]/form/input");

    //
    @Step("clickSearch")

    public SearchPage clickSearch(String incorrectSearchData) throws InterruptedException{


        driver.findElement(searchButton).sendKeys(incorrectSearchData);
        Thread.sleep(2000);
        return this;

    }

}
