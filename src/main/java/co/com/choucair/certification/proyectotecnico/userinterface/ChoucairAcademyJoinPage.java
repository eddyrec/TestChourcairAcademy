package co.com.choucair.certification.proyectotecnico.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairAcademyJoinPage {
    public static final Target JOIN_BUTTON = Target.the("Button that shows us the form to Register")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
