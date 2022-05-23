import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Kategoriler extends BaseTest {

    public Kategoriler(){
    }

    @Step({"Elementi <xpath> bul ve <keyword> değeri ile kategoriler sayfasinda olundugunu dogrula"})
    public void kategorilerCheck(String xpath, String keyword) {
        System.out.println("Kategoriler sayfasi basarili bir sekilde acildi ");
        Assert.assertTrue("Kategoriler sayfasi acilamadi ", ((MobileElement) appiumDriver.findElement(By.xpath(xpath))).getText().equals(keyword));
    }
}
