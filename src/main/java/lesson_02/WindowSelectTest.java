package lesson_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowSelectTest {
    WebDriver driver;
    @BeforeTest
    public void openchrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\se_pro\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void testWin() throws InterruptedException {
        driver.get("C:\\selenium_html\\index.html");
        driver.findElement(By.linkText("Open new window")).click();
        Thread.sleep(3000);

        String handle1=driver.getWindowHandle();
        for(String handles:driver.getWindowHandles()){
            if(handles.equals(handle1)){
                continue;
            }else{
                driver.switchTo().window(handles);
            }
        }

//        driver.switchTo().window();
        driver.findElement(By.linkText("baidu")).click();

    }

    @AfterTest
    public void closedchrome()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }

}
