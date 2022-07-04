package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class CommonMethods extends PageInitializers {

    public static WebDriver drv;

    public static void openBrowserAndLanuchApplication() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        WebDriverManager.chromedriver().setup();
        drv = new ChromeDriver();
        drv.get(ConfigReader.getPropertyValue("url3"));
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        initializePageObjects();
    }

    public static String getTimeStamp (String pattern){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static byte[] takeScreenShot( String fileName){
        TakesScreenshot ts = (TakesScreenshot)  drv;
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFile, new File(Constants.SCREENSHOT_FILEPATH + fileName + " " + getTimeStamp("MM-yyyy-dd-HH-mm-ss") + ".png" ));
        } catch (IOException e){
            e.printStackTrace();
        }
        return picBytes;
    }

    public static void tearDown() {
        drv.quit();
    }

    public static void sendKeys (WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
}
