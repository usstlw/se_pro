package lesson_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterTest {
    WebDriver driver;
    @BeforeTest
    public void openchrome(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\se_pro\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://mail.163.com/");
    }

    @Test
    public void registest(){
    }

    }




}
