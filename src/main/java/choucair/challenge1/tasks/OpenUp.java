package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.uTestPage;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task{
    private uTestPage utestpage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public  <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(utestpage));
    }
}
