import java.net.URL;


import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends TestBase {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "denisandreyanov1");
        caps.setCapability("browserstack.key", "mGqyyuHKGyYe3SnxaPpz");

        // Set URL of the application under test
        caps.setCapability("app", "bs://f64346d19abd2f1c84644241292798b2bd5676c2");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);


        /* Write your Custom code here */
        $(MobileBy.id("ru.wsoft.push.app:id/next_btn")).click();
        //Close recommendations
        $(MobileBy.id("ru.wsoft.push.app:id/close_image_view")).click();
        //Set number
        $(MobileBy.id("ru.wsoft.push.app:id/inputPhoneEditText")).setValue("79190895613");
        //Click next
        $(MobileBy.id("ru.wsoft.push.app:id/nextBtn")).click();
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }
}