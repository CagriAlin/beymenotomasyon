package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BasketPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public BasketPage(WebDriver driver) {

        super(driver);
    }

    public void basketPageMethod() throws InterruptedException { //Sepet Sayfası Test Senaryosu

            logger.info("Ürün fiyatı ile sepet fiyatı aynı.");

            Select selectTo = new Select(driver.findElement(By.xpath("//*[@id='quantitySelect0']")));
            selectTo.selectByIndex(1);
            logger.info("Ürün adedi 2 yapıldı.");
            Thread.sleep(2000);
    }

}
