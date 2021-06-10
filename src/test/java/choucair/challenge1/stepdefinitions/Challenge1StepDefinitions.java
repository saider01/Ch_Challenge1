package choucair.challenge1.stepdefinitions;

import choucair.challenge1.model.Challenge1Data;
import choucair.challenge1.questions.Answer;
import choucair.challenge1.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class Challenge1StepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^that Antonio wants to create a new user at Utest$")
    public void thatAntonioWantsToCreateANewUserAtUtest() {
        OnStage.theActorCalled("Antonio").wasAbleTo(OpenUp.thePage(), (GoTo.joinToday()));
    }

    @When("^he fill the form to create a new user$")
    public void heFillTheFormToCreateANewUser(List<Challenge1Data> challenge1Data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillForm1.the(challenge1Data.get(0).getStrName(), challenge1Data.get(0).getStrLastName(), challenge1Data.get(0).getStrEmail()),
                FillForm2.the(),
                FillForm3.the(),
                FillForm4.the(challenge1Data.get(0).getStrPassword()));
    }

    @Then("^he finish and send the form$")
    public void heFinishAndSendTheForm(List<Challenge1Data> challenge1Data) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(challenge1Data.get(0).getStrSearch())));
    }
}
