package cucumberstarter;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;


public class OrderCoffeeSteps {
    private String barista;

    @Given("{string} is {int} meter(s) from the coffee shop")
    public void cathy_is_n_meters_from_the_coffee_shop(String name, int distanceInMeters) {
        System.out.println(name + " is " + distanceInMeters + " meters far from the coffee shop");
    }
    //@ParameterType("/\"[^\"]*\"/gm")

    @When("{string} orders a {string}")
    public void customer_orders_a(String name, String order) {
        System.out.println(name + "'s order is " + order);
    }

    @Then("{} should receive the order")
    public void barry_should_receive_the_order(String baristaName) {
        barista = baristaName;
        System.out.println(baristaName + " is receiving the order");
    }

    @Then("He/She/They should know that the coffee is {}")
    public void barrista_should_know_that_the_coffee_is(String orderStatus) {
        System.out.println(barista + "  knows the order status is " + orderStatus);
    }

    @Given("Cathy has a Caffeinate-Me account")
    public void a_caffeinate_me_customer_named() {
        System.out.println("new customer is registered: ");
    }

    @When("{string} orders for following items")
    public void ordersForFollowingItems(String customer, DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps();
        for (Map<String, String> row : list) {
            String product = row.get("product");
            int quantity = Integer.parseInt(row.get("quantity"));
            String productOutput = product + (quantity > 1 ? "s" : "");

            System.out.println(customer + " orders " + quantity + " " + productOutput);


        }
    }

    @Then("the order should contain following products:")
    public void theOrderShouldContainFollowingProducts(List<String> expectedProducts) {
        for (String item : expectedProducts) {
            System.out.println("Cathy orders 1 " + item);
        }
    }
}