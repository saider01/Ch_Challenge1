package choucair.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalPage {
    public static final Target CHECK_EMAIL = Target.the("Final page from create new user")
            .located(By.xpath("//*[text()='First, please check your email inbox']"));
}
