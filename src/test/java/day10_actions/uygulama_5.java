package day10_actions;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;

public class uygulama_5 extends TestBase {

    @Test
    public void test01() throws InterruptedException {

    //1- Bir Class olusturalim KeyboardActions2
    //2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe");
    //3- video’yu gorecek kadar asagi inin
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ARROW_UP).perform();
    //4- videoyu izlemek icin Play tusuna basin
       WebElement iframe=driver.findElement(By.xpath("(//iframe[@width='560'])[1]"));
            driver.switchTo().frame(iframe);
        WebElement playTuşu=driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
        actions.click(playTuşu).perform();
        Thread.sleep(3000);

        //5- videoyu calistirdiginizi test edin
        Assert.assertFalse(playTuşu.isDisplayed());



        }
    }