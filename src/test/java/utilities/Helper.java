package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class Helper {
	

    public static void captureScreenshot(WebDriver driver, String testName) {
    	
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "screenshots/" + testName + "_" + timestamp + ".png";

            FileUtils.copyFile(src, new File(fileName));
            System.out.println("Screenshot saved to: " + fileName);

        } catch (Exception e) {
            System.err.println("Failed to take screenshot: " + e.getMessage());
        }
    }
}
