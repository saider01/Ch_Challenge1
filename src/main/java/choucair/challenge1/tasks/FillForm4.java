package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.FillForm4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm4 implements Task {

    public static FillForm4 the() {
        return Tasks.instrumented(FillForm4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("MyUltraSafeKey05").into(FillForm4Page.PASSWORD),
                Enter.theValue("MyUltraSafeKey05").into(FillForm4Page.PASSWORD_CONFIRMATION),
                Click.on(FillForm4Page.TERM_USE),
                Click.on(FillForm4Page.PRIVACY),
                Click.on(FillForm4Page.NEXT_BUTTON)
                );
    }
}
