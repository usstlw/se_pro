package lesson_02;

import org.testng.Assert;
import org.testng.annotations.*;

public class Test_02 {
    @DataProvider()
    public Object[][] user(){
        return new Object[][]{
                {"tim","123"},
                {"tim2","1234"},
                {"tim3","tim3"}
        };
    }

    @BeforeTest
    public void Before(){
        System.out.println("测试之前");
    }

    @Test(dataProvider = "user")
    public void test_01(String username,String passwd){
        Assert.assertEquals(username,passwd,"比较tim的值");
    }

    @Test
    @Parameters({"test1","test"})
    public void test_02(String test11,String test){
        System.out.println(test11);
        System.out.println(test);
        Assert.assertEquals(test11,test,"比较tim的值ccvcccccc");
    }

    @AfterTest
    public void After(){
        System.out.println("测试结束");
    }
}
