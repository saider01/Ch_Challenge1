package choucair.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillForm4Page {

    public static final Target PASSWORD = Target.the("Where do we write the password")
            .located(By.id("password"));
    public static final Target PASSWORD_CONFIRMATION = Target.the("Where do we write the password confirmation")
            .located(By.id("confirmPassword"));
    public static final Target TERM_USE = Target.the("Where do we Accept terms of use")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY = Target.the("Where do we Accept privacy policy")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target NEXT_BUTTON = Target.the("button to finish")
            .located(By.xpath("//*[@id='laddaBtn']/span"));
}
