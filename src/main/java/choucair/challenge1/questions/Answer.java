package choucair.challenge1.questions;

import choucair.challenge1.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question=question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String checkEmail = Text.of(FinalPage.CHECK_EMAIL).viewedBy(actor).asString();
        if (question.equals(checkEmail)) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}