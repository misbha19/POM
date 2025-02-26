import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends Base{

@FindBy(css="[data-airgap-id='5']") WebElement logo;
@FindBy (xpath = "//input[@aria-label='Search Costco']") WebElement search;
@FindBy (css = ".MuiBox-root.mui-gg4vpm h1") WebElement searchResult;
@FindBy (xpath = "//button[contains(text(), 'No Thanks')]") WebElement noThanksButton;


boolean isLogoVisible() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
    try {
        // Thread.sleep(5000);
         WebElement noThanks = wait.until(ExpectedConditions.elementToBeClickable(noThanksButton));
         noThanks.click();
     } catch (Exception e) {
        System.out.println("Proceeding, as no such button found.");
        // throw new RuntimeException(e);
     }
    return logo.isDisplayed();
}


void search(String text){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
    try {
        WebElement noThanks = wait.until(ExpectedConditions.elementToBeClickable(noThanksButton));
        noThanks.click();
    } catch (Exception e) {
        System.out.println("Proceeding, as no such button found.");
    }
   search.sendKeys(text, Keys.ENTER);
}


String searchResult(){
   System.out.println(searchResult.getText() + "check on page");
  return searchResult.getText();
}

}
