package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    public static AppiumDriver<WebElement> driver;

    public static AppiumDriver<WebElement> setUpDriver() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        //desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_3a_API_30_x86");
        desiredCapabilities.setCapability("noReset","true");
        desiredCapabilities.setCapability("automationName","uiAutomator2");
        desiredCapabilities.setCapability("appPackage","blibli.mobile.commerce");
        desiredCapabilities.setCapability("appActivity","blibli.mobile.ng.commerce.core.init.view.SplashActivity");
        desiredCapabilities.setCapability("newCommandTimeout",0);

        driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4720/wd/hub"),desiredCapabilities);
        return driver;
    }
}
