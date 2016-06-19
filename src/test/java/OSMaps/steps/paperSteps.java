package OSMaps.steps;

import OSMaps.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by sadha on 15/06/2016.
 */
public class paperSteps {
    @When("^I enter a url$")
    public void OPEN() {

        //  new HomePage().link();
        new HomePage().newUrl();
    }

    @Then("^I should be in home page$")
    public void CLOSE() {
        Assert.assertEquals(new PapermapPage().paperTitle(), "Find paper maps by location");

    }

    ////////
    @Given("^I am in all papermap  page$")
    public void i_am_in_all_papermap_page() {
        new HomePage().newUrl();
        new IndivisualProduct().singlr();
        new IndivisualProduct().shoppingCartLink();
    }


    @When("^I add two products in shopping cart$")
    public void i_add_two_products_in_shopping_cart() {
        new SecondProduct().goToBack();
        new SecondProduct().goToSecond();
        new IndivisualProduct().shoppingCartLink();
        new Basket().basket();
        new Basket().basketCheckout();
    }


    @Then("^I should be view these two produts in shopping cart page$")
    public void i_should_be_view_these_two_produts_in_shopping_cart_page() {
  // Assert.assertEquals(  new Basket().name(),   "Three Peaks Challenge Map ");


    }
}
