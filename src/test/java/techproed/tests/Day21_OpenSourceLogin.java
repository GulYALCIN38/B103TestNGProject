package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDasboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {
    OpenSourcePage openSourcePage=new OpenSourcePage();
    OpenSourceDasboardPage openSourceDasboardPage=new OpenSourceDasboardPage();

    @Test
    public void test01() {

   //1.sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));
        // 2.page objesi yap --->sinif duzeyinde yapildi

        //3.bu objeyi kullanarak objelere ulas

        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));

        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));
        openSourcePage.submitButon.click();

        // 4. ASSERTION

        Assert.assertTrue(openSourceDasboardPage.dashboardHeader.isDisplayed());








    }
}
