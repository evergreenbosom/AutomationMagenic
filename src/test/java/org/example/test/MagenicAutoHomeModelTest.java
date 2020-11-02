package org.example.test;
import com.magenic.jmaqs.selenium.BaseSeleniumTest;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.example.pagemodels.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

public class MagenicAutoHomeModelTest extends BaseSeleniumTest {


    @Test(priority = 1)
    public void asyncPageTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnAsncLink();
        AsyncPageModel async = new AsyncPageModel(this.getTestObject());
        String actual = async.getLoadedText();
        String expected = "Loaded";
        System.out.println("Expected: " + expected);
        System.out.println("Actual :" + actual);
        Assert.assertEquals(actual, expected, "Verify the Loaded text present");
    }
    @Test(priority = 2)
    public void swaggerApiTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnSwaggerApiLink();
        Thread.sleep(5000);
        SwaggerApiPageModel swaggerapi = new SwaggerApiPageModel(this.getTestObject());
        String actual = swaggerapi.getSwaggerApiPageText();
        String expected = "Magenic Automation Test Site API";
        System.out.println("Actual:" + actual);
        System.out.println("Expected :" + expected);
        Assert.assertEquals(actual, expected, "Verify The Magenic Automation Test Site API Text Present ");
    }

    @Test(priority = 3)
    public void showDailogTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnShowDailogLink();
        ShowDailogPageModel showdailog = new ShowDailogPageModel(this.getTestObject());
        String actual = showdailog.getShowDailogText();
        String expected = "Close";
        System.out.println("Actual:" + actual);
        System.out.println("Expected:" + expected);
        Assert.assertEquals(actual, expected, "Verify the Close Button Present");
        showdailog.clickCloseButton();
    }



    }



