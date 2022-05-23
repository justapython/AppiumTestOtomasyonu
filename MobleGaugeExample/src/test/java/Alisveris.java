import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Alisveris extends BaseTest {

    public Alisveris() {
    }


    @Step({"Elementi <xpath> bul ve <keyword> değeri ile karsilastirarak sayfada olundugunu dogrula"})
    public void textControl(String xpath, String keyword) {
        System.out.println("Alisveris sayfasinda olundugu dogrulandi ");
        Assert.assertTrue("Alisveris sayfasina gidilemedi ", ((MobileElement) appiumDriver.findElement(By.xpath(xpath))).getText().equals(keyword));
    }

}