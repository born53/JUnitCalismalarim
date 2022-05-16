package day05_JUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class C04_BeforeAfter {
    WebDriver driver;
    @Before
    public void setUp(){
        System.out.println("BEFORE METHOD");//hangisinin calistigini gormat icin yazdik
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        System.out.println("AFTER METHOD");
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