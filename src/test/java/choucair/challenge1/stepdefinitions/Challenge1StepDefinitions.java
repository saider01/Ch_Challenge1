package choucair.challenge1.stepdefinitions;


import choucair.challenge1.questions.Answer;
import choucair.challenge1.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class Challenge1StepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^that Antonio wants to create a new user at Utest$")
    public void thatAntonioWantsToCreateANewUserAtUtest() {
        OnStage.theActorCalled("Antonio").wasAbleTo(OpenUp.thePage(), (GoTo.joinToday()));
    }

    @When("^he fill the form to create a new user$")
    public void heFillTheFormToCreateANewUser() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm1.the(), FillForm2.the(), FillForm3.the(), FillForm4.the());
    }

    @Then("^he finish and send the form(.*)$")
    public void heFinishAndSendTheForm(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
