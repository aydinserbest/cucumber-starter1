package cucumberstarter;

import io.cucumber.java.en.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OrderCoffeeSteps {
    Customer cathy=new Customer();
    String cathysOrder;

    @Given("^Cathy is (\\d+) meters from the coffee shop$")
    public void cathy_is_n_meters_from_the_coffee_shop(int distanceInMeters) {
        cathy.setDistanceFromShop(distanceInMeters);
    }
    @When("^Cathy orders a (.*)$")
    public void cathy_orders_a(String order) {
        cathysOrder=order;
        cathy.placesOrderFor(cathysOrder);
    }
    @Then("Barry should receive the order")
    public void barry_should_receive_the_order() {
        Barrista barry = new Barrista();
        assertThat(barry.getPendingOrders(), hasItem(cathysOrder));
        //advanced jsonpath expressions videosunda var
    }
    @Then("Barry should know that the coffee is Urgent")
    public void barry_should_know_that_the_coffee_is_urgent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
