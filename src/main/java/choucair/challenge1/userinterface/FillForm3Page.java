package choucair.challenge1.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillForm3Page {
    public static final Target COMPUTER = Target.the("Where do we activate de dropdown/textbox for OS")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target COMPUTER_TEXTBOX = Target.the("Where do we select the OS")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));

    public static final Target VERSION = Target.the("Where do we activate de dropdown/textbox for version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target VERSION_TEXTBOX = Target.the("Where do we select the version")
            .located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));

    public static final Target LANGUAGE = Target.the("Where do we activate de dropdown/textbox for language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target LENGUAGE_TEXTBOX = Target.the("Where do we select the language")
            .located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));

    public static final Target MOBILE = Target.the("Where do we activate de dropdown/ for mobile")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target MOBILE_TEXTBOX = Target.the("Where do we select the mobile")
            .located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));

    public static final Target MODEL = Target.the("Where do we activate de dropdown/textbox for model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target MODEL_TEXTBOX = Target.the("Where do we select the model")
            .located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));

    public static final Target MOBILE_OS = Target.the("Where do we activate de dropdown/textbox for mobile OS")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target MOBILE_OS_TEXTBOX = Target.the("Where do we select the mobile OS")
            .located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_BUTTON = Target.the("button to go next form")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
