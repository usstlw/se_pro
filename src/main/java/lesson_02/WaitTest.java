package lesson_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {
    WebDriver driver;
    @BeforeTest
    public void openchrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\se_pro\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void waitTest() throws InterruptedException {
        driver.get("C:\\selenium_html\\index.html");
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
        //Thread.sleep(5000);

        String text = driver.findElement(By.xpath("//*[@id=\"display\"]/div[1]")).getText();
        Assert.assertEquals(text,"wait for display");

    }

    @Test
    public void waitTest2() throws InterruptedException {
        driver.get("C:\\selenium_html\\index.html");
        driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();

        new WebDriverWait(driver,5).until(ExpectedConditions.presenceOfElementLocated(By.className("red")));
        String text=driver.findElement(By.xpath("//*[@id=\"display\"]/div")).getText();

        System.out.println(text);

    }

    @AfterTest
    public void closedchrome()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

}
