package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BasePage;

public class IncreaseProductInBasketFunction extends BasePage  {

    private By openAmount = By.xpath("//*[@class='quantity-select-box border w-100']");
    private By increaseAmount = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div/form/div[2]/div[1]/table/tbody/tr[2]/td[2]/div[2]/div/select/option[2]");
    public IncreaseProductInBasketFunction(WebDriver driver) {
        super(driver);
    }
    public void increaseProduct() throws InterruptedException {
        Thread.sleep(5000);
        element(openAmount).click();
        Thread.sleep(2500);
        element(increaseAmount).click();
        Thread.sleep(4000);

    }
}
