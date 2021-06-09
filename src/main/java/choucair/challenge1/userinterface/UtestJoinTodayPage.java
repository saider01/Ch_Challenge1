package choucair.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinTodayPage {
    public static final Target JOIN_BUTTON = Target.the("button to create a new user")
            .located(By.xpath("//*[text() = 'Join Today']"));
}