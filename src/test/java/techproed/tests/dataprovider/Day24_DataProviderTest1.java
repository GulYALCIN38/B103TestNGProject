package techproed.tests.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day24_DataProviderTest1 {
    /*
Data Provider Nedir?
***Veri deposudur. Bir cok veriyi Test Caselere loop kullanmadan aktarmak icin kullanilir
***Data provider 2D(2 boyutlu) object return eder
***Data provider TestNG den gelen bir ozellikdir
Data Provider ne icin kullanilir?
***Data provider DDT(Data Driven Testing) icin kullanilir. Birden fazla datayi test caselerde kullanmak icin kullanilir
Data Provider i nasil kullanirsin?
***@DataProvider annotasyonu ile veri havuzu olusturulur.
@Test metotlariaa bu data havuzu dataProvider parametresi ile baglanir.
Data provider da 2 tane parametre vardir:
***name : metot ismini override etmek icin, yani farkli bir isim ile data provider i cagirmak icin kullanir
***parallel : parallel test case ler olusturmak icin kullanilir
 */
//om
    //DATA PROVIDER
    @DataProvider(name="smoke_test")//name yazinca data provieder in ismi degisisr
    public Object[][]urunler(){
        Object urunListesi[][]={{"tesla"},{"bmw"},{"mercedes"},{"honda"},{"toyota"},{"volvo"}

        };
        return urunListesi;
    }


    @Test(dataProvider = "urunler")
    public void test01(String data) {
        System.out.println(data);

    }
//google aramasi
    @Test(dataProvider = "smoke_test")
    public void test02(String araclar) {
        Driver.getDriver().get("https://www.google.com");
        try {
            Driver.getDriver().findElement(By.xpath("(//*[@class='QS5gu sy4vM'])[2]")).click();
        } catch (Exception e) {

        }
        Driver.getDriver().findElement(By.name("q")).sendKeys(araclar, Keys.ENTER);
        assert Driver.getDriver().getTitle().contains(araclar);
    }
}
