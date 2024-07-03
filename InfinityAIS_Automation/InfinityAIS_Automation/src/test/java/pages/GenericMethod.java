package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class GenericMethod implements WebElement {
    static WebDriver driver;

    private static By CaseID= By.xpath("//input[@id='b18-Input_CaseID']");

    private static By CaseIDValue = By.xpath("//span[@class='case_title']");


    public void waitElementToBeVisible(int milliSeconds, WebElement element) {
        try {
            FluentWait wait = new FluentWait(driver);
            wait.withTimeout(Duration.ofMillis(milliSeconds));
            wait.ignoring(Exception.class);
            wait.pollingEvery(Duration.ofMillis(1000));
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.print("Waited :    " + milliSeconds + "   For  " + element + "To be Clickable");
        } catch (Exception e) {
            System.err.println("" + e);
        }

    }
    public void waitElementToBeClickable(int milliSeconds, WebElement element) {
        try {
            FluentWait wait = new FluentWait(driver);
            wait.withTimeout(Duration.ofMillis(milliSeconds));
            wait.ignoring(Exception.class);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            wait.pollingEvery(Duration.ofMillis(1000));
            System.out.print("Waited :    " + milliSeconds + "   For  " + element + "To be Clickable");
        } catch (Exception e) {
            System.err.println("" + e);
        }
    }
    public static void waitFor(int time) throws InterruptedException {
        Thread.sleep(time * 1000L);
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getText(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String elementText = (String) js.executeScript("return arguments[0].innerText;", element);
        return elementText;
    }
    public void jsClick(WebElement ele) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", ele);
        waitFor(3);
    }

    public static boolean isElementDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        }
        finally{
            System.out.println("Element is not displayed");
        }

    }

    public void enterText(String str) throws Exception {
        sendKeys(str);
    }

    public void jsEnterData(WebElement ele, String str) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + str + "';", ele);
    }


    public void scrollIntoViewElement(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitElementToBeClick(int milliSeconds, WebElement element) {
        int maxAttempts = 5;
        int initialAttempt = 1;
        boolean clickable = false;
        while (initialAttempt<=maxAttempts) {
            try {
                FluentWait wait = new FluentWait(driver);
                wait.withTimeout(Duration.ofMillis(milliSeconds));
                wait.ignoring(Exception.class);
                wait.until(ExpectedConditions.elementToBeClickable(element));
                wait.pollingEvery(Duration.ofMillis(1000));
                System.out.print("Waited :    " + milliSeconds + "   For  " + element + "To be Clickable");
                jsClick(element);
                clickable =true;
            } catch (Exception e) {
                System.err.println("" + e);
            }
            initialAttempt++;
            if(!clickable){
                System.err.print("After trying with"+" "+maxAttempts+"  "+" attempts not able able to click on the element");
            }
        }
    }

    @Override
    public void click() {

    }

    @Override
    public void submit() {

    }

    @Override
    public void sendKeys(CharSequence... charSequences) {

    }

    @Override
    public void clear() {

    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String s) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String s) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }
}
