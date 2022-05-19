package day10_actions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class C01_TestBaseFirstClass extends TestBase {


    @Test
    public void test01(){
        driver.get("https://www.amazon.com");

    }


}
