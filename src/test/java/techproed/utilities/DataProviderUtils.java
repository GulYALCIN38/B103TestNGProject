package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] musteriVeileri(){
        Object [][]musteriGirisBilgileri={
                {"menejer1","12345","besiktas"},
                {"menejer2","98765","cebeci"},
                {"mejejer3","5678","karsiyaka"}

        };
        return musteriGirisBilgileri;
    }
    @DataProvider
    public Object[][] musteriHizmetleriVerileri(){
        Object [][] musteriHizmetleriGirisBilgileri = {
                {"adam1","3456"},
                {"ali2","1234"},
                {"nancy3","7890"}
        };
        return musteriHizmetleriGirisBilgileri;
    }
    @DataProvider
    public Object[][] personelVerileri(){
        Object [][] personelGirisBilgileri = {
                {"rukiye1","abc1"},
                {"mehmet2","123r"},
                {"emin3","3edc"},
                {"baran3","4asd"},
                {"okumus3","6e45"}
        };
        return personelGirisBilgileri;
    }

    //excelden data provider a data gelir bu datalari burdan da tast case gonderebiliriz

    @DataProvider
    public Object [][]customerData(){

        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sheet="customer_info";
        ExcelUtils excelUtils=new ExcelUtils(path,sheet);
        Object [] [] musteriBilgileri=excelUtils.getDataArrayWithoutFirstRow();
        return musteriBilgileri;
    }
}
