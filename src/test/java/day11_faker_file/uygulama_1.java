package day11_faker_file;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class uygulama_1 extends TestBase {
    @Test
    public void test01() {

        //1. Tests packagenin altina bir class oluşturun : C05_UploadFile
        //2. https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //3. chooseFile butonuna basalim
        WebElement dummyLinki = driver.findElement(By.xpath("//a[text()='dummy.txt']"));
        dummyLinki.click();
        //4. Yuklemek istediginiz dosyayi secelim.
        //5. Upload butonuna basalim.
        //6. “File Uploaded!” textinin goruntulendigini test edelim


    }
}
