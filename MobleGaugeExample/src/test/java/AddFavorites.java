import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AddFavorites extends BaseTest {

    public AddFavorites() {
    }

    @Step({"<Key> Favorilere ekle"})

    public void clickElementByxpath(String Key) {
        ((MobileElement) appiumDriver.findElement(By.xpath(Key))).click();
        System.out.println(Key + "Tiklandi");


    }

}