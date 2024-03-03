package cucumberstarter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class AddItemActions extends UIInteractionSteps {

    @Step("User adds the {0} item to the list")
    public void called(String todoItem) {
        $(".new-todo").typeAndEnter(todoItem);
//        driver.findElement(By.cssSelector(".new-todo")).sendKeys(todoItem);
//        driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
    }

}
