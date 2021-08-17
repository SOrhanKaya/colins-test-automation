package testCase;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.AddToBasketFunction;
import testCaseFunction.ColinsHomepageFunction;
import testCaseFunction.IncreaseProductInBasketFunction;
import testCaseFunction.SearchFunction;
import utils.BaseTest;

@Listeners({Listener.class})
public class ColinsAutomation extends BaseTest {
    @Test(priority = 1)
    public void homepageTest() throws InterruptedException {
        ColinsHomepageFunction colinsHomepageFunction = new ColinsHomepageFunction(driver);
        colinsHomepageFunction.Homepage();
        Thread.sleep(7500);
        //colins.com.tr anasayfası açılır ve kadın kategorisine tıklanır
        //pop-up kapatılır

    }
    @Test(priority = 2)
    public void addToBasket() throws InterruptedException {
        AddToBasketFunction addToBasketFunction = new AddToBasketFunction(driver);
        addToBasketFunction.addToBasketProduct();
        Thread.sleep(5000);
        //ilk ürün seçilir ve ürün detay sayfasına gidilir
        //beden seçilir ve ürün sepete eklenir
        //sepete gidilir
    }
    @Test(priority = 3)
    public void increaseProduct() throws InterruptedException {
        IncreaseProductInBasketFunction increaseProductInBasketFunction = new IncreaseProductInBasketFunction(driver);
        increaseProductInBasketFunction.increaseProduct();
        Thread.sleep(3500);
        //sepetteki ürün sayısı artırılır
    }
    @Test(priority = 4)
    public void searchPants() throws InterruptedException {

        SearchFunction searchFunction = new SearchFunction(driver);
        searchFunction.Search();
        Thread.sleep(5000);
        driver.quit();
        //arama kısmına pantolon yazılıp arama yapılır.
        //sepete geri gidilerek test sonlandırılır.
    }



    }

