package co.com.choucair.certification.proyectotecnico.stepdefinitions;
import co.com.choucair.certification.proyectotecnico.model.AcademyChoucairData;
import co.com.choucair.certification.proyectotecnico.questions.Answer;
import co.com.choucair.certification.proyectotecnico.tasks.Join;
import co.com.choucair.certification.proyectotecnico.tasks.OpenUp;
import co.com.choucair.certification.proyectotecnico.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    //Abre Pagina y Entra a Formulario de Registro
    @Given("^than Eduardo wants to create a new user at Utest$")
    public void thanEduardoWantsToCreateANewUserAtUtest() {
        OnStage.theActorCalled("Eduardo").wasAbleTo(OpenUp.thePage(), (Join.thePage()));// Write code here that turns the phrase above into concrete actions

    }
    //Rellena Formulario de Registro
    @When("^he fill out the Sign up form$")
    public void heFillOutTheSignUpForm(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Eduardo").wasAbleTo( (Register.
                onThePage(academyChoucairData.get(0).getStrName(),academyChoucairData.get(0).getStrLName()
                         ,academyChoucairData.get(0).getStrEmail(),academyChoucairData.get(0).getStrMonth()
                         ,academyChoucairData.get(0).getStrDay(),academyChoucairData.get(0).getStrYear()
                         ,academyChoucairData.get(0).getStrZip() ,academyChoucairData.get(0).getStrPassword()
                )));

    }
    //Valida que se haya realizado el registro correctamente.
    @Then("^he completes the Sign up form$")
    public void heCompletesTheSignUpForm(List<AcademyChoucairData> academyChoucairData)  throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrComplete())));
    }

}
