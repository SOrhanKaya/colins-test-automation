package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class AddToBasketFunction extends BasePage {
    private By selectProduct = By.xpath("//*[@class='ins-web-smart-recommender-box-item']");
    private By openVariant = By.xpath("//*[@class='border p-3 w-100']");
    private By selectVariant = By.xpath("/html/body/div[1]/div[2]/div/form/div/div[3]/div/div[1]/div[5]/div/div[2]/select/option[2]");
    private By addToBasket = By.cssSelector("#addtocartbutton");
    private By goToBasket = By.cssSelector(".basketLink");


    public AddToBasketFunction(WebDriver driver) {
        super(driver);
    }
    public void addToBasketProduct() throws InterruptedException {
        Thread.sleep(3500);
        element(selectProduct).click();
        Thread.sleep(1500);
        element(openVariant).click();
        Thread.sleep(2500);
        element(selectVariant).click();
        Thread.sleep(2500);
        element(addToBasket).click();
        Thread.sleep(2500);
        element(goToBasket).click();
        Thread.sleep(6000);

    }
}
