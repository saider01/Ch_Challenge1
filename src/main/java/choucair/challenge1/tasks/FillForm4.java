package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.FillForm4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm4 implements Task {
    private String strPassword;

    public FillForm4(String strPassword) {
        this.strPassword = strPassword;
    }

    public static FillForm4 the(String strPassword) {
        return Tasks.instrumented(FillForm4.class, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(FillForm4Page.PASSWORD),
                Enter.theValue(strPassword).into(FillForm4Page.PASSWORD_CONFIRMATION),
                Click.on(FillForm4Page.TERM_USE),
                Click.on(FillForm4Page.PRIVACY),
                Click.on(FillForm4Page.NEXT_BUTTON)
                );
    }
}
