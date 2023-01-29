package techproed.tests.excel_automation;

import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;

import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class Day23_ExcelLogin {
    BlueRentalHomePage blueRentalHomePage = new BlueRentalHomePage();
    BlueRentalLoginPage blueRentalLoginPage = new BlueRentalLoginPage();
    ExcelUtils excelUtils;
    List<Map<String, String>> excelDatalari;

    public void login() {//logine gitme metodu
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        // home page logine tikla
        blueRentalHomePage = new BlueRentalHomePage();
        blueRentalLoginPage = new BlueRentalLoginPage();

        //-------ilk giris icin calisir--------------
        //login link butonu sadece ilk giriste sayfada gorunur  2. ve 3. girislerde gorulmez ve
        // no suchelemnt exceotion alinir. fakat biz bu exceptuonu try cath ile yakalriz ve test case calismaya deva eder
        try {
            blueRentalHomePage.loginLink.click();
            ReusableMethods.waitFor(1);
        } catch (Exception e) {


        }

        // ----------------sonraki girisler--------------

        try {
            //kullanici ID ye tikla--------------try catch
            blueRentalHomePage.userID.click();
            ReusableMethods.waitFor(1);

            //Logout linkine tikla----------try catch
            blueRentalHomePage.logOutLink.click();
            ReusableMethods.waitFor(1);

            //OK e tikla---try catch------------try catch
            blueRentalHomePage.OK.click();
            ReusableMethods.waitFor(1);

            //home page logine tikla----------try catch
            blueRentalHomePage.loginLink.click();
            ReusableMethods.waitFor(1);


        } catch (Exception e) {


        }

        //login sayfasindayiz
    }

    @Test
    public void customerLogin() {
        String path = "./src/test/java/resources/mysmoketestdata.xlsx";//  ./ onceki tum dosyalari icer! relatif path
        String nomDePage = "customer_info";
        //DATALARI Excelutis sinifindaki methotlar ile aliriz
        excelUtils=new ExcelUtils(path,nomDePage);
        //excel datalarini bir getdatalist() methot ile cekecegiz
        excelDatalari=excelUtils.getDataList();
        //loop kullanarak datalari tek tek test case de kullan
        for (Map<String, String> data:excelDatalari){

            login();
            //kullanici adi ve sifresini excelden alarak gir logine tikla
            blueRentalLoginPage.emailBox.sendKeys(data.get("username"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.passwordBox.sendKeys(data.get("password"));
            ReusableMethods.waitFor(1);
            blueRentalLoginPage.loginButton.click();
            ReusableMethods.waitFor(1);



        }



    }
    /*
             sam.walker@bluerentalcars.com	c!fas_art
         kate.brown@bluerentalcars.com	tad1$Fas
         raj.khan@bluerentalcars.com	v7Hg_va^
         pam.raymond@bluerentalcars.com	Nga^g6!


       ------ILK GIRIS---------
HOME PAGE DEYIZ
home page logine tikla---try catch e koyduk
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
------2. GIRIS-----
HOME PAGE DEYIZ
kullanici ID ye tikla--------------try catch
Logout linkine tikla----------try catch
OK e tikla---try catch------------try catch
home page logine tikla----------try catch
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
------3. GIRIS---------
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
---------4. GIRIS------------
HOME PAGE DEYIZ
kullanici ID ye tikla
Logout linkine tikla
OK e tikla
home page logine tikla
LOGIN PAGE DEYIZ
kullanici adini gir(excelden al)
kullanici sifresini git(excelden al)
login page login buttonuna tikla
     */
}
