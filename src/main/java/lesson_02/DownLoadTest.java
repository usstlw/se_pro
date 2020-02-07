package lesson_02;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownLoadTest {

    @Test
    public void testFirefoxDown(){
        FirefoxProfile firefoxProfile=new FirefoxProfile();
        firefoxProfile.setPreference("browser.download.folderList","2");
        firefoxProfile.setPreference("browser.download.dir","D:\\soft");

    }

}
