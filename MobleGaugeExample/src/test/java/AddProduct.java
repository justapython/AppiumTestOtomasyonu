import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class AddProduct extends BaseTest {

    public AddProduct() {
    }

    @Step({"<Key> ürünü sepete ekle"})
    public void clickElementByid(String Key) {
        ((MobileElement) appiumDriver.findElement(By.id(Key))).click();
        System.out.println(Key + "Elementine tiklandi");
    }

}
