package OSMaps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sadha on 19/06/2016.
 */
public class Basket extends DriverManager{
    @FindBy (className="basket-link")
    public WebElement _basketLink;

    public void basket(){
        _basketLink.click();
    }

    @FindBy (className="editBasket")
    public WebElement _editBasket;

    public void  basketCheckout(){
        _editBasket.click();


    }
    @FindBy (css=".product-name>a")
    public WebElement _nameProduct;

    public void name(){
      String text=  _nameProduct.getText();
        System.out.println(text);
    }


}
