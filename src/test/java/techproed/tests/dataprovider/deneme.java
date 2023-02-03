package techproed.tests.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class deneme {

    String path="./src/test/java/resources/mysmoketestdata.xlsx";
    String sheet="customer_info";

    ExcelUtils excelUtils;
    List <Map<String, String>>isimler;

    @DataProvider(name="smoke")
    public Object[][] bilgiler(){
        excelUtils= new ExcelUtils(path,sheet);

        String [][] bilgiler = excelUtils.getDataArrayWithoutFirstRow();
        System.out.println(Arrays.toString(bilgiler));
        return bilgiler;
    }


    @Test(dataProvider ="smoke")
    public void testName(String email, String sifre) throws IOException {
        BlueRentalLoginPage blueRentalLoginPage;
        BlueRentalHomePage blueRentalHomePage;
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage= new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();
        ReusableMethods.waitFor(1);// 1 saniye bekle
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.emailBox.sendKeys(email);
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.passwordBox.sendKeys(sifre);
        ReusableMethods.waitFor(1);
        blueRentalLoginPage.loginButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(blueRentalHomePage.userID);
        ReusableMethods.waitFor(1);
        //ReusableMethods.getScreenshot("EkranGoruntusu");
        blueRentalHomePage.userID.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.logOutLink.click();
        ReusableMethods.waitFor(1);
        blueRentalHomePage.OK.click();




    }
}

