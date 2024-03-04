package cucumberstarter.screenplay.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    public static Performable toHomePage() {
        return Open.url("https://todomvc.com/examples/angular/dist/browser/#/all");
    }
}
