package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public final WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver=driver;
        wait=new WebDriverWait(driver,10);
    }
    public void open(String urlPart) {
        driver.get("https://www.saucedemo.com/"+urlPart);
    }
}
