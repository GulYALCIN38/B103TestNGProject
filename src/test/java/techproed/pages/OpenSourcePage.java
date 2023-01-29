package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    //page objelerini bu sinifta buluruz
    //1. costractor

    public OpenSourcePage() {
        //    PageFactory selenyumdan gelen ve sayfa elementlerini intantiate(baslangigic degeri vermek) etmek icin kullanilir
        //boylece sayfa objeleri cagirilinca nullpointer exeotion alinmaz
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // 3 adet page objelerini olusturun
    // public WebElement username=
    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submitButon;
}
