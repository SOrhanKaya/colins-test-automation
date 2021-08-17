package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ColinsHomepageFunction extends BasePage {
    private By womanCategory = By.cssSelector("li.menu-wrapper:nth-child(2) > h2:nth-child(1) > a:nth-child(1)");
    private By closePopUp = By.xpath("//div[@class='element-content']");
    public ColinsHomepageFunction(WebDriver driver) {
        super(driver);
    }
    public void Homepage() throws InterruptedException {
        String baseUrl = "https://www.colins.com.tr/";
        driver.get(baseUrl);
        Thread.sleep(3500);
        element(womanCategory).click();
        Thread.sleep(5000);
        driver.switchTo().frame(4);
        Thread.sleep(4500);
        element(closePopUp).click();


    }

}
