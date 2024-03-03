package cucumberstarter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class NavigateActions extends UIInteractionSteps {
    @Step("User opens the todo list application")
    public void toHomePage(){
        this.openUrl("https://todomvc.com/examples/angular/dist/browser/#/all");
    }
}
