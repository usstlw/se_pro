package lesson_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_04 {
    @BeforeTest
    public void Before(){
        System.out.println("测试之前");
    }

    @Test
    public void test_01(){
        Assert.assertEquals("username","passwd","比较tim的值");
    }

    @Test
    public void test_02(){
        WebDriver driver = new FirefoxDriver();
        Assert.assertEquals("test","test11","比较tim的值");
    }

    @Test
    public void iframeTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("C:\\selenium_html\\index.html");
        //通过ID或name方式转交控制权
        //        driver.switchTo().frame("aa");
        //通过webelement方式
        WebElement iframe=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.linkText("baidu")).click();
        Thread.sleep(3000);
        //driver控制权转交给原来界面
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("登陆界面")).click();
    }

    @Test
    public void selectTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("C:\\selenium_html\\index.html");
        WebElement selcetEl=driver.findElement(By.id("moreSelect"));
        //实例化select类
        Select select =new Select(selcetEl);
        //通过索引选择下拉框
        select.selectByIndex(2);
        Thread.sleep(3000);
        //通过属性value值选择下拉框
        select.selectByValue("huawei");
        Thread.sleep(3000);
        //通过文本值来选择下拉框
        select.selectByVisibleText("iphone");

    }
    @AfterTest
    public void After(){
        System.out.println("测试结束");
    }
}
