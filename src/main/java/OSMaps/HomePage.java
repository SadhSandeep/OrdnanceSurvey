package OSMaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends  DriverManager {
  @FindBy(linkText = "LEISURE")
    public WebElement _Link;


    public void clickLink(){
      _Link.click();
        }

    @FindBy(partialLinkText  = "Paper maps")
    public WebElement _paperLink;

  @FindBy(xpath = ".//*[@id='modulePrimaryNavigation']/ul/li[1]/ul/li[1]/ul/li[1]/a")
  public WebElement _allPaperLink;

//  @FindBy(className ="module-home-banner-link")
//  public WebElement _LinkTrailer;
//
//  public void trail(){
//    _LinkTrailer.click();
//  }

public void link(){
  _Link.click();
}

  public void goToPaper(){
        Actions action = new Actions(driver);
        action.moveToElement(_Link).moveToElement(_allPaperLink).click().build().perform();

    }
  public void newUrl(){
    driver.navigate().to("https://www.ordnancesurvey.co.uk/shop/maps.html");
  }

}
