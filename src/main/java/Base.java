import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {
    static WebDriver driver;

    void setup (String url){
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }
    void clean (){
        driver.quit();
    }
}
