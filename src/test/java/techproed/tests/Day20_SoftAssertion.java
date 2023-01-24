package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day20_SoftAssertion {
    @Test
    public void softAsserttest() {
        //1.soft assert objesi olustur
        SoftAssert softAssert = new SoftAssert();
        System.out.println("satir 11");
        softAssert.assertEquals(2, 5);//fail
        System.out.println("satir 13");
        softAssert.assertTrue("java".contains("r"));
        System.out.println("satir 15");
        softAssert.assertTrue("java".contains("a"));
        System.out.println("satir 17");
        softAssert.assertAll();//pass ya da fail olarak isaretler bunu kullanmazssak test hep gece

    }
}
