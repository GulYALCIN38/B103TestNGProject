package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproHomePage {
    public TechproHomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2")
    public WebElement  secureArea;

    @FindBy(xpath = "//*[@class='btn btn-dark']")
    public WebElement  logaut;

}
