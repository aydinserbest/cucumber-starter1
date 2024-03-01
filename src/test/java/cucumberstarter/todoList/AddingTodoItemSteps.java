package cucumberstarter.todoList;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class AddingTodoItemSteps {
    WebDriver driver;
    @Before("@webtest")
    public void setupDriver(){
        driver = new ChromeDriver();
    }
    @After("@webtest")
    public void teardown(){
        driver.quit();
    }
    @Given("Tom has an empty todo list")
    public void tom_has_an_empty_todo_list() {
        driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");
    }
    @When("He adds {string}")
    public void he_adds(String todoItem) {
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(todoItem);
        driver.findElement(By.cssSelector(".new-todo")).sendKeys(Keys.ENTER);
    }
    @Then("He should have he following item in his list:")
    public void he_should_have_he_following_item_in_his_list(List<String> todoItems) {
        List<String> displayedItems =
                driver.findElements(By.cssSelector(".view label"))
                .stream().map(WebElement::getText).collect(Collectors.toList());

        assertThat(displayedItems).containsExactlyElementsOf(todoItems);
    }



}
