package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchBox extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public SearchBox(WebDriver driver) {

        super(driver);
    }

    Actions action = new Actions(driver);

    public void searchBoxMethod() throws InterruptedException {     //Arama Çubuğu Test Senaeyosu

        clickTo(By.cssSelector("input[class='default-input o-header__search--input']"));
        Thread.sleep(1500);

        sendKeys(By.cssSelector("input[class='default-input o-header__search--input']") , "pantolon");
        logger.info("Arama alanına pantolon yazıldı.");

        action.sendKeys(Keys.ENTER).build().perform();
        logger.info("Ürün aratıldı.");
    }
}