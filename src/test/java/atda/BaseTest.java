package atda;

import com.saucelabs.saucebindings.SauceSession;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    WebDriver driver;
    @Before
    public void setup()  { driver=getDriver();   }
    @After
    public void cleanup(){   driver.quit();   }

    private WebDriver getDriver(){
    //    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
      //  return new ChromeDriver();
        return new SauceSession().start();
    }


}
