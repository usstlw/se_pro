package lesson_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;

public class ActionTest2 {
    WebDriver driver;
    @BeforeTest
    public void openchrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\se_pro\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();

    }

    @Test
    public void rightClickTest(){
        driver.get("http://www.baidu.com/");
        WebElement buttonBaidu=driver.findElement(By.id("su"));
        Actions actions=new Actions(driver);
        //actions.contextClick(buttonBaidu).perform();
        actions.contextClick().perform();
    }

    @Test
    public void saveHtml() throws AWTException, InterruptedException {
        driver.get("http://www.baidu.com/");
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        int keyS=(int)new Character('S');
        System.out.println(keyS);
        robot.keyPress(87);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

    @Test
    public void saveHtml2() throws AWTException, InterruptedException {
        driver.get("http://www.baidu.com/");
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }



    @AfterTest
    public void closedchrome()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
