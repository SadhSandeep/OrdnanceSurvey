
package OSMaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sadha on 19/06/2016.
 */
public class IndivisualProduct extends DriverManager {
    @FindBy (linkText = "Three Peaks Challenge Map")
    public WebElement _sinleProduct;

    public void singlr() {
        _sinleProduct.click();
    }


     @FindBy (css= ".button.btn-cart")
          public  WebElement _shopping;


         public void shoppingCartLink() {
             _shopping.click();
         }


    }



