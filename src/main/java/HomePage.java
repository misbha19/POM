import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends Base{

@FindBy(css=".MuiBox-root.mui-saptuz a img") WebElement logo;
@FindBy (xpath = "//input[@aria-label='Search Costco']") WebElement search;
@FindBy (css = ".MuiBox-root.mui-gg4vpm h1") WebElement searchResult;
@FindBy(css = ".mui-1pgflb3") WebElement noThanks;


boolean isLogoVisible() {
waitForElementVisibility(5000, logo);
return logo.isDisplayed();
}


void search(String text){
    waitForElementVisibility(5000, search);
    clickNoThanks();
   search.sendKeys(text, Keys.ENTER);
}

void clickNoThanks(){
    waitForElementVisibility(10000, noThanks);
    noThanks.click();
}


String searchResult(){
   System.out.println(searchResult.getText() + "check on page");
  return searchResult.getText();
}

}
