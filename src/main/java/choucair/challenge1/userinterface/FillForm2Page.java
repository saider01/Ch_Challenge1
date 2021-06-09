package choucair.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillForm2Page {
    public static final Target CITY = Target.the("Where do we write the city")
            .located(By.id("city"));
    public static final Target ZIPCODE = Target.the("Where do we write the zipcode")
            .located(By.id("zip"));
    public static final Target COUNTRY = Target.the("Where do we activate dropdown for country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY_TEXTBOX = Target.the("Where do we write the country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_BUTTON = Target.the("button to go next form")
            .located(By.xpath("//*[text() = 'Next: Devices']"));
}
