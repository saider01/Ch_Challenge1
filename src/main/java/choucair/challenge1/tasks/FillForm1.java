package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.FillForm1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm1 implements Task {
    public static FillForm1 the() {
        return Tasks.instrumented(FillForm1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Ramiro").into(FillForm1Page.FIRST_NAME),
                Enter.theValue("Hernandez Garcia").into(FillForm1Page.LAST_NAME),
                Enter.theValue("ramirohendes3425@srfer.com").into(FillForm1Page.EMAIL),
                Click.on(FillForm1Page.MONTH),
                Click.on(FillForm1Page.DAY),
                Click.on(FillForm1Page.YEAR),
                Click.on(FillForm1Page.NEXT_BUTTON));
    }
}
