package cucumberstarter;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ListOrMapSteps {
    @Given("John is {int} meters from the coffee shop")
    public void john_is_meters_from_the_coffee_shop(int int1) {

    }

    @When("John orders for following items")
    public void john_orders_for_following_items(DataTable dataTable) {
        List<List<String>> list = dataTable.asLists();
        for (List<String> strings : list) {
            System.out.println(strings.get(0) + " " + strings.get(1));
        }
    }

    @And("When Brew orders for following items")
    public void whenBrewOrdersForFollowingItems(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps();
        for (Map<String, String> map : maps) {
            System.out.println(map.get("product") + " " + map.get("quantity"));
        }
    }
    @And("When Mellow orders for following items")
    public void Mellow_Orders_For_FollowingItems(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        System.out.println(map.get("product")+" "+map.get("quantity"));
    }


    @Then("the order should contain the following products:")
    public void the_order_should_contain_the_following_products(DataTable dataTable) {
        List<String> list = dataTable.asList();
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
            // or
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Then("He should know that the coffee is: {string}")
    public void he_should_know_that_the_coffee_is(String string) {

    }


}
