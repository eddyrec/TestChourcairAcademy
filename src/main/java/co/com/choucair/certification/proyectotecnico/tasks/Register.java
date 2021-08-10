package co.com.choucair.certification.proyectotecnico.tasks;

import co.com.choucair.certification.proyectotecnico.userinterface.ChoucairAcademyRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {
    private String strName;
    private String strLName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strZip;
    private String strPassword;


    public Register(String strName, String strLName, String strEmail, String strMonth, String strDay, String strYear, String strZip, String strPassword) {
        this.strName = strName;
        this.strLName = strLName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strZip = strZip;
        this.strPassword = strPassword;
    }


    public static Register onThePage(String strName,String strLName, String strEmail, String strMonth, String strDay, String strYear, String strZip, String strPassword){
        return Tasks.instrumented(Register.class,strName,strLName,strEmail,strMonth,strDay,strYear,strZip,strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Enter.theValue(strName).into(ChoucairAcademyRegisterPage.INPUT_NAME),
                Enter.theValue(strLName).into(ChoucairAcademyRegisterPage.INPUT_LNAME),
                Enter.theValue(strEmail).into(ChoucairAcademyRegisterPage.INPUT_EMAIL)
                , SelectFromOptions.byVisibleText(strMonth).from(ChoucairAcademyRegisterPage.SELECT_MONTH)
                , SelectFromOptions.byVisibleText(strDay).from(ChoucairAcademyRegisterPage.SELECT_DAY)
                , SelectFromOptions.byVisibleText(strYear).from(ChoucairAcademyRegisterPage.SELECT_YEAR)
                ,Click.on(ChoucairAcademyRegisterPage.INPUT_BUTTON)
                ,Enter.theValue(strZip).into(ChoucairAcademyRegisterPage.INPUT_ZIP)
                ,Click.on(ChoucairAcademyRegisterPage.INPUT_BUTTON)
                ,Click.on(ChoucairAcademyRegisterPage.INPUT_BUTTON)
                ,Enter.theValue(strPassword).into(ChoucairAcademyRegisterPage.INPUT_Password)
                ,Enter.theValue(strPassword).into(ChoucairAcademyRegisterPage.INPUT_Password2)
                ,Click.on(ChoucairAcademyRegisterPage.CHECK_TERMS)
                ,Click.on(ChoucairAcademyRegisterPage.CHECK_PRIVACY)
                ,Click.on(ChoucairAcademyRegisterPage.INPUT_BUTTON)
        );

}


}