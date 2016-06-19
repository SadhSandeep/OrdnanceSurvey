package OSMaps;

//import org.jboss.netty.util.Timeout;
//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


/**
 * Created by sadha on 15/06/2016.
 */
public class DriverManager {
    public DriverManager(){
        PageFactory.initElements(driver,this);
    }
    public static WebDriver driver;
    public void openBrowser() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream ("C:\\OrdnanceSurvey\\src\\test\\resource\\config.properties");
        properties.load(fileInputStream);
        String url = properties.getProperty("url");
        System.out.println(url);
        String browser = properties.getProperty("browser");
        System.out.println(browser);
//        String nodeURL="http://localhost:4444/wd/hub";
//       DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
//      capabilities.setBrowserName("firefox");
//      driver = new ChromeDriver();
//      capabilities.setPlatform(Platform.WINDOWS);
//      driver = new RemoteWebDriver(new URL(nodeURL),capabilities);

      if (browser.equalsIgnoreCase("firefox")){

           driver = new FirefoxDriver();
       }
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closeBrowser(){
        driver.quit();
    }
}
