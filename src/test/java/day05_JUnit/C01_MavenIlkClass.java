package day05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class C01_MavenIlkClass {
   public static void main(String[] args) {
// chrome kullanarak
      // WebDriverManager.chromedriver().setup();
       //WebDriver driver = new ChromeDriver();
    //opera kullanarak
      // WebDriverManager.operadriver().setup();
      // WebDriver driver = new OperaDriver();
       //edge kullanarak
       WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       driver.get("https://www.amazon.com");
       driver.close();




    }
}
