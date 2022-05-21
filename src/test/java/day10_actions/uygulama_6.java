package day10_actions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class uygulama_6 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //Yeni Class olusturun ActionsClassHomeWork
        //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2- Hover over Me First" kutusunun ustune gelin
        Actions actions= new Actions(driver);
        WebElement hoverOverMeFirst= driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
     actions.moveToElement(hoverOverMeFirst).perform();

        //3- Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[@class='list-alert'])[1]")).click();
        //4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //6- “Click and hold" kutusuna basili tutun
        WebElement clickAndHold=driver.findElement(By.xpath("(//div[@class='col-lg-12 text-center'])[3]"));
        actions.clickAndHold(clickAndHold).perform();
        Thread.sleep(3000);
        //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.xpath("//*[text()='Well done! keep holding that click now.....']")).getText());
        //8- “Double click me" butonunu cift tiklayin
        WebElement doubleClick=driver.findElement(By.xpath("//div[@class='div-double-click']"));
        actions.doubleClick(doubleClick).perform();

    }

    public static class uygulama_7 extends TestBase {
        @Test
        public void test01() {

            // Window Handle HomeWork
            //1."http://webdriveruniversity.com/" adresine gidin
            //2."Login Portal" a kadar asagi inin
            //3."Login Portal" a tiklayin
            //4.Diger window'a gecin
            //5."username" ve "password" kutularina deger yazdirin
            //6."login" butonuna basin
            //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
            //8.Ok diyerek Popup'i kapatin
            //9.Ilk sayfaya geri donun
            //10.Ilk sayfaya donuldugunu test edin

            driver.get("http://webdriveruniversity.com/");
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']")).click();
           /* String firstPageWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandle = driver.getWindowHandles();
            String seconPageWindowHandle = allWindowHandle.
                    stream().
                    filter(t -> !t.
                            equals(firstPageWindowHandle)).
                    collect(Collectors.
                            toList()).
                    get(0);
            driver.switchTo().window(seconPageWindowHandle);*/












                /*//1."http://webdriveruniversity.com/" adresine gidin
                driver.get("http://webdriveruniversity.com/");
                String firsPageUrl = driver.getCurrentUrl();
                //2."Login Portal" a kadar asagi inin
                Actions actions = new Actions(driver);
                actions.sendKeys(Keys.PAGE_DOWN).perform();
                Thread.sleep(3000);
                //3."Login Portal" a tiklayin
                String firstPageWindowHandle = driver.getWindowHandle();
                driver.findElement(By.xpath("//*[text()='LOGIN PORTAL']")).click();
                //4.Diger window'a gecin
                Set<String> allWindowHandle = driver.getWindowHandles();
                String seconPageWindowHandle = allWindowHandle.
                        stream().
                        filter(t -> !t.
                                equals(firstPageWindowHandle)).
                        collect(Collectors.
                                toList()).
                        get(0);
                driver.switchTo().window(seconPageWindowHandle);
                //5."username" ve "password" kutularina deger yazdirin
                //6."login" butonuna basin
                Faker faker = new Faker();
                WebElement usernameElement = driver.findElement(By.id("text"));
                actions.
                        click(usernameElement).
                        sendKeys(faker.name().username()).
                        sendKeys(Keys.TAB).
                        sendKeys(faker.internet().password()).
                        sendKeys(Keys.TAB).
                        sendKeys(Keys.ENTER).perform();
                //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
                String exceptedPopText = "validation failed";
                String actualPopText = driver.switchTo().alert().getText();
                Assert.assertEquals(exceptedPopText, actualPopText);
                //8.Ok diyerek Popup'i kapatin
                driver.switchTo().alert().accept();
                //9.Ilk sayfaya geri donun
                driver.switchTo().window(firstPageWindowHandle);
                //10.Ilk sayfaya donuldugunu test edin
                String firstPageUrlAfterSwitch = driver.getCurrentUrl();
                Assert.assertEquals(firsPageUrl, firstPageUrlAfterSwitch);*/





        }
    }
}
