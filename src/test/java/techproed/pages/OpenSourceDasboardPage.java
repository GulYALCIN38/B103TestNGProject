package techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourceDasboardPage {

    public OpenSourceDasboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h6[.='Dashboard']")
    public WebElement dashboardHeader;
}
