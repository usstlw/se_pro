package lesson_02;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_03 {

    @BeforeTest
    public void Before(){
        System.out.println("测试之前");
    }

    @Test
    public void test_01(){
        Assert.assertEquals("username","passwd","比较tim的值");
    }

    @Test(groups={"smoke"})
    public void test_02(){
        Assert.assertEquals("test","test11","比较tim的值");
    }

    @AfterTest
    public void After(){
        System.out.println("测试结束");
    }
}
