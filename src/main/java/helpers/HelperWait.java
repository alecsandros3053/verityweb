package helpers;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;

import java.time.Duration;

public class HelperWait {
    public  static void waitPresenceOfElement(WebElement locator, long timeout){
        new WebDriverWait(Driver.getDriver(), timeout).until(ExpectedConditions.visibilityOf(locator));
    }

    public  static void waitPresenceOfElementLocated(WebElement locator, int timeout, String texto){
        new WebDriverWait(Driver.getDriver(), timeout).until(ExpectedConditions.textToBePresentInElement(locator, texto));
    }
    public static WebElement waitVisible(WebElement locator, int timeout){
        return new WebDriverWait(Driver.getDriver(), timeout).until(ExpectedConditions.visibilityOf(locator));
    }

    public static WebElement waitClicable(WebElement locator, int timeout){
        return new WebDriverWait(Driver.getDriver(), timeout).until(ExpectedConditions.elementToBeClickable(locator));
    }
}