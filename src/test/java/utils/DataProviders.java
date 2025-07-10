package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "excelLoginData")
    public static Object[][] getLoginDataFormExcel()
    {
        ExcelUtils excel = new ExcelUtils("src/test/resource/TesdtData.xlsx,Sheet1");
        return excel.getDataArray();
    }
}
