import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class LoginPage extends BaseTest {

    public void LoginPage(){}

    protected static Logger logger = Logger.getLogger(String.valueOf(LoginPage.class));


    @Step({"Giris elementi <xpath> bul ve <keyword> değerini kontrol et"})
    public void textControl(String xpath, String keyword) {
        //System.out.println("Giris sayfasinda olundugu dogrulandi ");
        logger.info("Giris sayfasinda olundugu dogrulandi");
    }

    @Step({"<Key> yerine <keywordc> değerini yaz"})
    public void SendkeyElementByxpath(String Key, String keywordc) {
        ((MobileElement)appiumDriver.findElement(By.xpath(Key))).sendKeys(new CharSequence[]{keywordc});
        System.out.println(Key + "Elementine tiklandi");
    }



}
