package co.com.choucair.certification.proyectotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairAcademyRegisterPage {

    public static final Target INPUT_NAME = Target.the("where do we write the Name")
            .located(By.id("firstName"));
    public static final Target INPUT_LNAME = Target.the("where do we write the Last Name")
            .located(By.id("lastName")); //
    public static final Target INPUT_EMAIL = Target.the("where do we write the Email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select the Month Dropdown")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do we select the day Dropdown")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select the Year Dropdown")
            .located(By.id("birthYear"));
    public static final Target INPUT_BUTTON = Target.the("where do we Go to the next station")
            .located(By.xpath("//a[@role='button']"));
    public static final Target INPUT_ZIP = Target.the("where do we write the Postal Code")
            .located(By.id("zip"));
    public static final Target INPUT_Password = Target.the("where do we write the Password")
            .located(By.id("password"));
    public static final Target INPUT_Password2 = Target.the("where do we write the confirmation of the Password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the("Check Terms and Conditions")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY = Target.the("Check Privacy Settings")
            .located(By.id("privacySetting"));
    public static final Target CHECK_COMPLETE = Target.the("Check if registration is complete")
            .located(By.xpath("//div[@class='image-box-header']//h1[contains(text(),'Welcome')]"));


}
