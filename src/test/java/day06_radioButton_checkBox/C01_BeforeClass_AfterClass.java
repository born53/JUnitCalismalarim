package day06_radioButton_checkBox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_BeforeClass_AfterClass {
    /*
    @BeforeClass ve @AfterClass notasyonlari sadece static methodlar icin calisir

    @BeforeClass ve @AfterClass notasyonları test sürecinde bir kere çalışırken, @Before ve
@After notasyonları her test method’unun başında ve sonunda çalışmaktadır
     */
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        System.out.println("BEFORE CLAS");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("AFTER CLAS");
        driver.close();
    }
    @Test
    public void test01(){
        System.out.println("test1");
        // Before method call
        driver.get("https://www.amazon.com");
        // After method call
    }

    @Test
    public void test02(){
        System.out.println("test2");
        driver.get("https://www.techproeducation.com");
    }
    @Test
    public void test03(){
        System.out.println("test3");
        driver.get("https://www.facebook.com");
    }
}
