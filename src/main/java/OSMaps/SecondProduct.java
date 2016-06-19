package OSMaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sadha on 19/06/2016.
 */
public class SecondProduct extends DriverManager {
    @FindBy (css=".category9>a")
    public WebElement _gotoBackPage;

    public void goToBack() {
        _gotoBackPage.click();
    }


        @FindBy(linkText = "Snowdon")
        public WebElement _secondProduct;

    public void goToSecond() {
        _secondProduct.click();
    }



    }

