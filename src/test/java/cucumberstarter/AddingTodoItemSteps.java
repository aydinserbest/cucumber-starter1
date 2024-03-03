package cucumberstarter;

import cucumberstarter.actions.AddItemActions;
import cucumberstarter.actions.DisplayedItemList;
import cucumberstarter.actions.NavigateActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingTodoItemSteps {
    @Steps
    NavigateActions navigate;
    @Steps
    AddItemActions addItem;

    DisplayedItemList displayedItemList;

    @Given("Tom has an empty todo list")
    public void tom_has_an_empty_todo_list() {
        navigate.toHomePage();
    }
    @When("He adds {string}")
    public void he_adds(String todoItem) {
        addItem.called(todoItem);
    }
    @Then("He should have he following item in his list:")
    public void he_should_have_he_following_item_in_his_list(List<String> todoItems) {
        List<String> displayedItems = displayedItemList.getDisplayedItems();
        /*
        above, the list comes from UI
        but, the parameter todoItems come from scenario step
         */
        assertThat(displayedItems).containsExactlyElementsOf(todoItems);
    }
}
