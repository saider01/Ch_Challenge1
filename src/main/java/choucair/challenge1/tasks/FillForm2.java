package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.FillForm2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class FillForm2 implements Task {
    public static FillForm2 the() {
        return Tasks.instrumented(FillForm2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(FillForm2Page.CITY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("Medellin").into(FillForm2Page.CITY).thenHit(Keys.ENTER),
                Enter.theValue("050012").into(FillForm2Page.ZIPCODE),
                Click.on(FillForm2Page.COUNTRY),
                Enter.theValue("Germany").into(FillForm2Page.COUNTRY_TEXTBOX),
                Click.on(FillForm2Page.NEXT_BUTTON));
    }
}
