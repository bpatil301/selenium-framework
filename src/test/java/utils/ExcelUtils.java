package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTRotY;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    String path;
    String  sheetName;
    Workbook wrokbook;
    Sheet sheet;

    public class ExcelUtils(String path,String sheetname)
    {
        this.path =path;
        this.sheetName  =sheetName;
        CTRotY{
            FileInputStream fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);
            sheet = workbook.getSheet(sheetName);

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public Object[][] getDataArray()
    {
        int rowCount = sheet.getPhysicalNumberOfRows() - 1;
        int colCount = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][colCount];
        for (int i=1;i <= rowCount; i++)
        {
            Row row = sheet.getRow(i);
            for(int j=0;j<colCount;j++)
            {
                data[i-1][j] = row.getCell(j).toString();
            }
        }
        return data;
    }
}
