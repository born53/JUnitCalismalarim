package day10_actions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class uygulama_4 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //facebook anasayfaya gidip
        driver.get("https://www.facebook.com");

        //yeni kayit olustur butonuna basalim
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

        //isim kutusunu locate edip
        WebElement isimKutusuLocate = driver.findElement(By.xpath("//input[@name='firstname']"));

        //geriye kalan alanlari tab ile dolasarak
        // formu doldurun
        Actions actions = new Actions(driver);
        actions.click(isimKutusuLocate)
                .sendKeys("Mustafa" + Keys.TAB
                        + "terzi" + Keys.TAB
                        + "5455455544" + Keys.TAB
                        + "selenyum@guzel.com" + Keys.TAB + Keys.TAB
                        + "01" + Keys.TAB
                        + "ocak" + Keys.TAB
                        + "1999" + Keys.TAB + Keys.TAB + Keys.RIGHT)

                .moveToElement(driver.findElement(By.xpath("//button[@name='websubmit']"))).click()
                .perform();
        Thread.sleep(5000);


    }
}