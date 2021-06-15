import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.Calendar;
import java.util.Random;

public class StepImplementation extends BaseTest {

    @Step("<number> saniye bekle")
    public void waitForSeceond(int number) throws InterruptedException {
        Thread.sleep(number*1000);
    }
    @Step("<key> elementine tıkla")
    public void allowLocation(String key){
        appiumDriver.findElement(By.id(key)).click();
    }



    @Step("<key> id li elemente <text>  değerini yaz")
    public void sendkeyBYid(String key,String text){
        appiumDriver.findElement(By.id(key)).sendKeys(text);
    }

    @Step("<key> xpathli elemente tıkla" )
    public void sendKeyByXpath(String key){
        appiumDriver.findElement(By.xpath(key)).click();

    }
    //bugünün tarihinden 2 gün sonraya tarih seçebilmek için yardım alınan site : https://stackoverflow.com/questions/48539936/appium-android-how-to-tap-using-the-text-value
   @Step("tarihinden 2 gün sonraya tıklama")
    public void chooseADate(){
        Calendar today=Calendar.getInstance();
        today.add(Calendar.DATE,2);
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text='"+today.get(Calendar.DATE)+"']")).click();
    }



}
