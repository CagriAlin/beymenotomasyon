package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void homePageMethod() throws InterruptedException {  //Anasayfa Test Senaryosu
        try {
            logger.info("Beymen Test Sonuçları");

            assertCont("https://www.beymen.com/");
            logger.info("Anasayfa aktif.");

            String account = textOne(By.cssSelector("a[title='Hesabım']"));
            String account1 = "Hesabım";
            assertComp(account, account1);

            String favorite = textTwo(By.cssSelector("a[title='Favorilerim']"));
            String favorite1 = "Favorilerim";
            assertComp(favorite, favorite1);

            String basket = textThree(By.cssSelector("a[title='Sepetim']"));
            String basket1 = "Sepetim";
            assertComp(basket, basket1);

            logger.info("Hesabım, Favorilerim, Sepetim kontrol edildi.");

            clickTo(By.id("onetrust-accept-btn-handler"));                  // Altenatif olarak site görünümünü daha temiz hale getirir
            logger.info("Önizleme kolaylığı açısından çerezler kabul edildi.");
            Thread.sleep(1500);
        } catch (Exception e) {

            logger.error("Hata: "+e);
        }
    }
}