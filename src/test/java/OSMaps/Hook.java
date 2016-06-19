package OSMaps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.BeforeClass;

import java.io.IOException;

/**
 * Created by sadha on 15/06/2016.
 */
public class Hook {
    DriverManager driverManager = new DriverManager();
    @Before
    public void setUp() throws IOException {
        driverManager.openBrowser();
    }
    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
