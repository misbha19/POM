import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Base {

    CartPage cart;

    @BeforeMethod
    void openBrowser(){
        setup("https://www.costco.com/CheckoutCartDisplayView");
        driver.manage().window().maximize();
        cart= PageFactory.initElements(driver, CartPage.class);

    }

    @AfterMethod
    void closeBrowser(){
        clean();

    }

    @Test
    void checkContinueShoppingButton (){
        cart.clickContinueShopping();
        String expectedUrl="https://www.costco.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }
    @Test
    void searchLocation(){
        cart.searchLocation();
        String expectedUrl="warehouse-locations";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));


    }
}
