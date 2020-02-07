package lesson_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionTest {
    WebDriver driver;
    @BeforeTest
    public void openchrome(){

        System.setProperty("webdriver.chrome.driver","D:\\testing\\webdriver_demo\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();

    }

    @Test
    public void testClick(){
        driver.get("http://www.baidu.com/");
        WebElement nuomilink=driver.findElement(By.name("tj_trnuomi"));
        nuomilink.click();
    }



    @AfterTest
    public void closedchrome()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
