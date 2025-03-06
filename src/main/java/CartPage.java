import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Base{


    @FindBy(css = "[automation-id='continueShoppingButton']")  WebElement continueShopping;
    @FindBy(css = "[title='enter city, state or zip']") WebElement searchStore;


    void clickContinueShopping(){
        waitForElementVisibility(10000, continueShopping);
        continueShopping.click();
    }

    void searchLocation(){
        waitForElementVisibility(10000, searchStore);
        searchStore.sendKeys("11377", Keys.ENTER);

    }
}
