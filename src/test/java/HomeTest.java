import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Base{

    HomePage home;

    @BeforeMethod
    void openBrowser(){
        setup("https://costco.com");
        driver.manage().window().maximize();
        home=PageFactory.initElements(driver,HomePage.class);
    }

    @AfterMethod
    void cleanup(){
        clean();
    }

    @Test //use (enabled = false) to prevent this test from running
    void  checkLogo(){
        boolean test=home.isLogoVisible();
        //Assert.assertFalse(test);
         Assert.assertTrue(test);
    }

    @Test
    void checkSearch (){
        String word="kitchen";
        home.search(word);
        String searchUrl = driver.getCurrentUrl();
        Assert.assertTrue(searchUrl.contains(word));
    }

}

