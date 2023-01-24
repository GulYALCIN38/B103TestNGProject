package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_DependsOnMethods {
    /*
    TestNG'de tüm @Test methodları birbirlerinden bagimsiz olarak calisirlar
    Eger methodlari bagimli hale getirmek istersem, dependsOnMethods parametresi kullanilir
    Burdaki ornekde, searchTest methodu homeTest methoduna bagimlidir
searchTest den once homeTest calisir
Eger homeTest basarili ise searchTest calisir.
Eget homeTest basarisiz ise, searchTest IGNORE edilir
 */

    @Test
    public void homeTest(){
        System.out.println("home test");
        Assert.assertTrue(false);//fail

    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest(){ // burayi calistirinca home testte calisti
        System.out.println("seach test");

    }

    @Test
    public void paymentTest(){
        System.out.println("Payment Test");

    }

}
