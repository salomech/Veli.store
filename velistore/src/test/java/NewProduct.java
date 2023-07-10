import PageObject.ProductPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;


import Utiles.Chromerunner;


public class NewProduct extends Chromerunner {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("choose category and click to see all products for this category , see choosen product and and add to wislist, sign in to see what is in my wishlist")
    public void productCategory() throws InterruptedException {
        ProductPage page = new ProductPage(driver);
        page
//                .clickScroll()
                .clickGifts()
                .clickFull()
                .clickProduct()
                .clickWishList()
                .enterValidEmail(correctEmailData)
                .enterValidPassword(correctPasswordData)
                .clickSignInBtn()
                .clickWishList()
                .clickMyVeli()
                .clickMyWishlist()
        ;

        Thread.sleep(6000);


    }

    @Test(priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("click main category to choose category and see products and scroll to element  ")
    public void productAdd() throws InterruptedException {
        ProductPage page = new ProductPage(driver);
        page
                .clickAllCategoryPr()
                .clickToChooseCategory()
                .clickToSeeProducts()
                .scrollToElement()
        ;

    }

}
