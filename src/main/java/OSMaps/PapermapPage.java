package OSMaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sadha on 17/06/2016.
 */
public class PapermapPage extends DriverManager{
    @FindBy(css=".title")
    public WebElement _paperTitleLink;

    public String  paperTitle(){
    String text=  _paperTitleLink.getText();
        System.out.println(text);
        return text;

    }
}
