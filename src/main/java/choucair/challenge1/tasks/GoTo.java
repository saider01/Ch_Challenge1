package choucair.challenge1.tasks;

import choucair.challenge1.userinterface.UtestJoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {
        public static GoTo joinToday() {
            return Tasks.instrumented(GoTo.class);
        }
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(UtestJoinTodayPage.JOIN_BUTTON));
        }
    }
