package cucumberstarter;

import cucumberstarter.actions.AddItemActions;
import cucumberstarter.actions.DisplayedItemList;
import cucumberstarter.actions.NavigateActions;
import cucumberstarter.screenplay.navigation.Navigate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddingTodoItemSteps {
    @Steps
    NavigateActions navigate;
    @Steps
    AddItemActions addItem;

    DisplayedItemList displayedItemList;
    Actor actor;

    @Managed
    WebDriver driver;

    @Given("{word} has an empty todo list")
    public void actorHasAnEmptyTodoList(String actorName) {
        System.out.println("sss");
        actor = Actor.named(actorName).whoCan(BrowseTheWeb.with(driver));
        actor.attemptsTo(Navigate.toHomePage());
    }
    @When("He adds {string}")
    public void he_adds(String todoItem) {

        //addItem.called(todoItem);
    }
    @Then("He should have he following item in his list:")
    public void he_should_have_he_following_item_in_his_list(List<String> todoItems) {
//        List<String> displayedItems = displayedItemList.getDisplayedItems();
//        /*
//        above, the list comes from UI
//        but, the parameter todoItems come from scenario step
//         */
//        assertThat(displayedItems).containsExactlyElementsOf(todoItems);
    }
}
