package listener;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Başarılı Şekilde Tamamlandı");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Başarısız");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Yapılmadı");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();


    }
}
