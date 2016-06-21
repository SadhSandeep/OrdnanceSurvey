package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by sadha on 20/06/2016.
 */
public class select {
    public static void selectText(WebElement element, String text){
        Select select = new Select(element) ;
        select.selectByVisibleText(text);


    }
    public static void selectvalue(WebElement element, String value){
        Select select = new Select( element) ;
        select.selectByValue(value);


    }
    public static void selectInt(WebElement  element, int  number){
        Select select = new Select(element) ;
        select.selectByIndex(number);


    }
}
