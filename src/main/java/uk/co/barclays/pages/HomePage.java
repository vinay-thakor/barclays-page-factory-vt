package uk.co.barclays.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(linkText = "Bank")
    WebElement _bankDropDownLink;

    @FindBy(linkText = "Borrow")
    WebElement _borrowDropDownLink;

    public void mouseHoverOnBankDropDownLink() {
        Reporter.log(" Mouse hover on " +_bankDropDownLink.toString()+"<br>");
        mouseHover(_bankDropDownLink);
        log.info(" Mouse hover on " +_bankDropDownLink.toString());
    }

    public void mouseHoverOnBorrowDropDownLink() {
        Reporter.log(" Mouse hover on "+_bankDropDownLink.toString()+"<br>");
        mouseHover(_borrowDropDownLink);
        log.info(" Mouse hover on "+_bankDropDownLink.toString());
    }






}
