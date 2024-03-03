package cucumberstarter.actions;

import net.serenitybdd.core.pages.PageComponent;

import java.util.List;

public class DisplayedItemList extends PageComponent {
    public List<String> getDisplayedItems(){
        return $$(".view label").texts();

        //        List<String> displayedItems =
//                driver.findElements(By.cssSelector(".view label"))
//                .stream().map(WebElement::getText).collect(Collectors.toList());
        
    }
}
