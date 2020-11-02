package org.example.pagemodels;

import com.magenic.jmaqs.selenium.BaseSeleniumPageModel;
import com.magenic.jmaqs.selenium.LazyWebElement;
import com.magenic.jmaqs.selenium.SeleniumConfig;
import com.magenic.jmaqs.selenium.SeleniumTestObject;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MagenicHomePageModel extends BaseSeleniumPageModel {

    /**
     * The URL for the page.
     */
    private static final String PAGE_URL = SeleniumConfig.getWebSiteBase() ;

    public void openLoginPage() {
        getWebDriver().navigate().to(PAGE_URL);
        Assert.assertTrue(this.isPageLoaded(), String.format("The web page %s is not loaded", PAGE_URL));
    }

    /**
     * Welcome Message Selector.
     */
    private static final By WELCOME_MESSAGE = By.cssSelector("#WelcomeMessage");

   private static final By About_Page = By.xpath("//*[@id=\"homeButton\"]/a");
    private  LazyWebElement About = new LazyWebElement(this.getTestObject(), By.xpath("//*[@id=\"homeButton\"]/a"),
            "Lazyaboutele");

    /**
     * Instantiates a new Home page model.
     *
     * @param testObject the test object
     */
    public MagenicHomePageModel(SeleniumTestObject testObject) {
        super(testObject);
    }

    public boolean isPageLoaded() {
        return false;
    }




    }

