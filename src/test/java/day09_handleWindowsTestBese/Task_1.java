package day09_handleWindowsTestBese;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_1 {
    //    Yeni bir class olusturun: WindowHandle
    //● Amazon anasayfa adresine gidin.
    // ● Sayfa’nin window handle degerini String bir degiskene atayin
    //● Sayfa title’nin “Amazon” icerdigini test edin
    //● Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
    //● Sayfa title’nin “TECHPROEDUCATION” icerdigini test edin
    //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
    //● Sayfa title’nin “Walmart” icerdigini test edin
    //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
         driver.close();
    }
    @Test
    public void test01(){
        //Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");

       // ● Sayfa’nin window handle degerini String bir degiskene atayin
         String ilkSayfaHandleDegeri=driver.getWindowHandle();

    }




}
