package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.FillForm1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm1 implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;

    public FillForm1(String strName, String strLastName, String strEmail) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static FillForm1 the(String strName, String strLastName, String strEmail) {
        return Tasks.instrumented(FillForm1.class, strName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(FillForm1Page.FIRST_NAME),
                Enter.theValue(strLastName).into(FillForm1Page.LAST_NAME),
                Enter.theValue(strEmail).into(FillForm1Page.EMAIL),
                Click.on(FillForm1Page.MONTH),
                Click.on(FillForm1Page.DAY),
                Click.on(FillForm1Page.YEAR),
                Click.on(FillForm1Page.NEXT_BUTTON));
    }
}
