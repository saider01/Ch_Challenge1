package choucair.challenge1.questions;

import choucair.challenge1.userinterface.FinalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strSearch;

    public Answer(String strSearch) {
        this.strSearch=strSearch;
    }

    public static Answer toThe(String strSearch) {
        return new Answer(strSearch);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String checkEmail = Text.of(FinalPage.CHECK_EMAIL).viewedBy(actor).asString();
        if (strSearch.equals(checkEmail)) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}