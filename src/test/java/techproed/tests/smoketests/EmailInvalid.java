package techproed.tests.smoketests;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;

import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class EmailInvalid {
    BlueRentalLoginPage blueRentalLoginPage=new BlueRentalLoginPage();
    BlueRentalHomePage blueRentalHomePage=new BlueRentalHomePage();

    @Test
    public void test02() throws InterruptedException {

        // Name: US101122_Negative_Login
        // Description: Geçerli email uzantısı olmadan kullanıcı girişi yapılamamalı
        // Acceptance Criteria: Kullanici geçersiz email uzantısı yazdiginda, hata mesajini almalı
        // Error Message: email must be a valid email
        // Dogru email uzantisi girildiğinde hata mesajı alınmamalı
        // https://email-verify.my-addr.com/list-of-most-popular-email-domains.php

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage.loginLink.click();
        Thread.sleep(2000);
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("mail_invalid"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));
        Thread.sleep(2000);
        assert blueRentalLoginPage.message_dallert.isDisplayed();

        Driver.getDriver().navigate().refresh();
        Thread.sleep(2000);
        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_sifre"));
        Thread.sleep(2000);
        assert !blueRentalLoginPage.emailBox.getAttribute("class").contains("invalid");



    }
/*    @Test
    public void test03() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        WebElement w=blueRentalHomePage.dropdown;
        Select select=new Select(w);
        select.selectByIndex(2);


        blueRentalHomePage.start.sendKeys(Faker.instance(Locale.FRANCE).address().cityName());
        blueRentalHomePage.finish.sendKeys(Faker.instance(Locale.FRANCE).address().cityName());
        //        Pick Up date
//        Pick Up time
//        Drop Off date
//        Drop Off time
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hhmmaa");
        Calendar calendar = Calendar.getInstance();
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dtf.format(currentDate);
       blueRentalHomePage.pickdate.sendKeys(formattedDate);
        //blueRentalHomePage.pickdate.sendKeys("30.01.2023");
        blueRentalHomePage.picktime.sendKeys(simpleDateFormat.format(calendar.getTime()));
        blueRentalHomePage.dropdate.sendKeys("05.02.2023");
        blueRentalHomePage.droptime.sendKeys(simpleDateFormat.format(calendar.getTime()));
        blueRentalHomePage.continuereservation.click();






    }*/
}
