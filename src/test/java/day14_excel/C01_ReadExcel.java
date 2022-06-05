package day14_excel;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class C01_ReadExcel {

    @Test
    public void readExcelTest() throws IOException {
        // 7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/resources/ulkeler.xlsx";
        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);//FileInputStream demek excell gidip okuyup bilisayar kod yerine getirmek
        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook workbook= WorkbookFactory.create(fis);//alinan kodlar selenyum icerisindeki workbook kaydettik
        //10. WorkbookFactory.create(fileInputStream)
        //11. Sheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet= workbook.getSheet("Sayfa1");//workbook kaydettikten sonra sayfa1 gidiyoruz
        //12. Row objesi olusturun sheet.getRow(index)
        Row row= sheet.getRow(3);//satira gider
        //13. Cell objesi olusturun row.getCell(index)
        Cell cell=row.getCell(3);//cell(sutundiyoruz ama selnyumda sutun yok)
        System.out.println(cell);
        // 3.index'deki satirin 3.index'indeki datanin Cezayir oldugunu test edin
        String expectedData="Cezayir";
        String actualData=cell.toString();
        Assert.assertEquals(expectedData,actualData);
        Assert.assertEquals(expectedData,cell.getStringCellValue());//boylede yazilir ama usteki daha uygun
    }
}
