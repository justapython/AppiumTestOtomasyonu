import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class RandomGenerator extends BaseTest {

    public RandomGenerator() {
    }

    @Step({"Random urun sec"})
    public void randomSelector() {
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random rnd = new Random();
        int rndInt = rnd.nextInt(elements.size());
        elements.get(rndInt).click();

    }
}