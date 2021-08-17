package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchFunction extends BasePage {
    String searchParameter = "pantolon";
    private By searchBox = By.id("TxtSearchBox");
    private By getSearch = By.id("searchengine");
    private By goToBasket = By.cssSelector(".basketLink");


    public SearchFunction(WebDriver driver) {
        super(driver);
    }
    public void Search() throws InterruptedException {
        element(searchBox).sendKeys(searchParameter);
        Thread.sleep(2500);
        element(getSearch).click();
        Thread.sleep(3500);
        element(goToBasket).click();
        Thread.sleep(2500);

    }

}
