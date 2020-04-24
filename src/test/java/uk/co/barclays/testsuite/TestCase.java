package uk.co.barclays.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

public class TestCase extends TestBase {
    HomePage homePage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp() {
        homePage = new HomePage();
    }

    @Test(priority = 0,groups = {"Regression","Smoke"})
    public void verifyMouseHoverActionOnBankDropDownLink() {
        //mouseHover on bank dropdown link
        homePage.mouseHoverOnBankDropDownLink();
    }

    @Test (priority = 1,groups = {"Regression"})
    public void verifyMouseHoverOnBorrowDropDownLink() {
        //mouseHover on borrow dropdown link
        homePage.mouseHoverOnBorrowDropDownLink();
    }

}
