package choucair.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillForm1Page {
    public static final Target FIRST_NAME = Target.the("Where do we write the first name")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Where do we write the last name")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Where do we write the email")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("Where do we select the month")
            .located(By.xpath("//select[@name='birthMonth']/option[6]"));
    public static final Target DAY = Target.the("Where do we select the day")
            .located(By.xpath("//select[@name='birthDay']/option[8]"));
    public static final Target YEAR = Target.the("Where do we select the year")
            .located(By.xpath("//select[@name='birthYear']/option[3]"));
    public static final Target NEXT_BUTTON = Target.the("button to go next form")
            .located(By.xpath("//*[text() = 'Next: Location']"));
}
