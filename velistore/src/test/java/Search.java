
import PageObject.SearchPage;
import Utiles.Chromerunner;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.time.Duration;

import static DataObject.SearchData.*;

    public class Search extends Chromerunner {
        @Test (priority = 1)
        @Severity(SeverityLevel.NORMAL)
        @Description("enter fake data for search")

        public void  incorrectSearchData() throws InterruptedException {

            SearchPage page = new SearchPage(driver);
            page
                    .clickSearch(fakeSearchData);


            boolean resultFound = false;

            if (resultFound) {
                System.out.println("Result found!");

            }
            else {
                System.out.println("Result not found!");
            }

        }
        @Test(priority = 2)
        @Severity(SeverityLevel.NORMAL)
        @Description("search with correct data")
        public  void correctSearchData() throws InterruptedException {
            SearchPage page = new SearchPage(driver);
            page.clickSearch(correctSearchData);
        }


        }

