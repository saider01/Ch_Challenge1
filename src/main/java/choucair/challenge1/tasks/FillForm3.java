package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.FillForm3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class FillForm3 implements Task {
    public static FillForm3 the() {
        return Tasks.instrumented(FillForm3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FillForm3Page.COMPUTER),
                Enter.theValue("Linux").into(FillForm3Page.COMPUTER_TEXTBOX).thenHit(Keys.ENTER),

                Click.on(FillForm3Page.VERSION),
                Enter.theValue("Kali").into(FillForm3Page.VERSION_TEXTBOX).thenHit(Keys.ENTER),

                Click.on(FillForm3Page.LANGUAGE),
                Enter.theValue("English").into(FillForm3Page.LENGUAGE_TEXTBOX).thenHit(Keys.ENTER),

                Click.on(FillForm3Page.MOBILE),
                Enter.theValue("Xiaomi").into(FillForm3Page.MOBILE_TEXTBOX).thenHit(Keys.ENTER),

                Click.on(FillForm3Page.MODEL),
                //WaitUntil.the(FillForm3Page.MODEL_TEXTBOX, isVisible()).forNoMoreThan(1).seconds(),
                Enter.theValue("Mi3").into(FillForm3Page.MODEL_TEXTBOX).thenHit(Keys.ENTER),

                Click.on(FillForm3Page.MOBILE_OS),
                Enter.theValue("Android 6.0.1").into(FillForm3Page.MOBILE_OS_TEXTBOX).thenHit(Keys.ENTER),

                Click.on(FillForm3Page.NEXT_BUTTON));
    }
}
