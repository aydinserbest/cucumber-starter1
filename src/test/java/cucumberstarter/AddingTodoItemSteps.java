package cucumberstarter;

import cucumberstarter.actions.AddItemActions;
import cucumberstarter.actions.DisplayedItemList;
import cucumberstarter.actions.NavigateActions;
import cucumberstarter.screenplay.navigation.Navigate;
import cucumberstarter.screenplay.tasks.AddATodoItem;
import cucumberstarter.screenplay.tasks.CurrentTodoItems;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingTodoItemSteps {
    @Steps
    NavigateActions navigate;
    @Steps
    AddItemActions addItem;

    DisplayedItemList displayedItemList;

    Actor actor;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @ParameterType(".*")
    public Actor actor(String actorName){
        return OnStage.theActorCalled(actorName);
    }
    @Given("{actor} has an empty todo list")
    public void actorHasAnEmptyTodoList(Actor actor) {
        actor.attemptsTo(Navigate.toHomePage());
    }
    @When("{actor} adds {string}")
    public void he_adds(Actor actor, String todoItem) {
        actor.attemptsTo(AddATodoItem.called(todoItem));
    }
    @Then("{actor} should have he following item in his list:")
    public void he_should_have_he_following_item_in_his_list(Actor actor, List<String> todoItems) {
        Collection<String> displayedItems
                = actor.asksFor(CurrentTodoItems.forThisActor());
        assertThat(displayedItems).containsExactlyElementsOf(todoItems);

//        /*
//        above, the list comes from UI
//        but, the parameter todoItems come from scenario step
//         */

    }
}
