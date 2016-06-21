package OSMaps.steps;

import OSMaps.Basket;
import OSMaps.HomePage;
import OSMaps.IndivisualProduct;
import OSMaps.SecondProduct;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Verify;

/**
 * Created by sadha on 21/06/2016.
 */
public class ShoppingBasketSteps  {
    @Given("^I am in shopping basket$")
    public void i_am_in_shopping_basket()  {
        new HomePage().newUrl();
        new SecondProduct().goToSecond();
        new IndivisualProduct().shoppingCartLink();
        new Basket().window();
        new Basket().windowClose();
        new Basket().basket();
        new Basket().basketCheckout(); /// ALL BASKET CHECK OUT FROM THE BASKET


    }

    @When("^I remove product$")
    public void i_remove_product()  {
        new Basket().removeProduct();


    }

    @Then("^I should be view shopping cart empty message$")
    public void i_should_be_view_shopping_cart_empty_message()  {
        Verify.verifyEqual(new Basket().removeMessage(),"Shopping Cart is Empty");

    }
    ////////////////////
    @When("^I add a quantity$")
    public void i_add_a_quantity() {
        new Basket().quantityAdd();
    }

    @Then("^I should be view quantity add$")
    public void i_should_be_view_quantity_add()  {
      Verify.verifyEqual(  new Basket().textQuantityAdd(),"7");

    }
    @When("^I decress quantity$")
    public void i_decress_quantity()  {
        new Basket().quantityLess();


    }
    @Then("^I should be view quantity less$")
    public void i_should_be_view_quantity_less()  {
        Verify.verifyEqual(  new Basket().textQuantityAdd(),"3");

    }


}
