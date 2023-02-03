package techproed.tests.dataprovider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {
    //bu ornekte data provider methodumuz util clasta olacak
    @Test(dataProvider = "musteriVeileri",dataProviderClass = DataProviderUtils.class)
    public void musteriVerileriTest(String username ,String password,String sube){
        System.out.println("Username : "+ username+". Password : "+password+". Sube : "+sube);

    }
    //    musteriHizmetleriVerileri // alfabetik siraya gore testler calisr  h v den once geldigi icin ilk biu test calisir
    @Test(dataProvider = "musteriHizmetleriVerileri",dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileriTest(String username,String password){

            System.out.println(username+"  |  "+password);


        }
    //    personelVerileri
    @Test(dataProvider = "personelVerileri",dataProviderClass = DataProviderUtils.class)
    public void personelVerileriTest(String username,String password){
        System.out.println(username+"  |  "+password);
    }
    // customer Data
    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)
    public void customerDataTest(String username ,String password){
        System.out.println("EXCEL DATALARIM");
        System.out.println(username+" ||||"+password);
    }


}
