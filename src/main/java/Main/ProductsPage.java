package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public ProductsPage(WebDriver driver) {

        super(driver);
    }

    public void productsPage() throws InterruptedException {   //Ürün Sayfası Test Senaryosu

            logger.info("Ürün sayfasına girildi.");
            Thread.sleep(1500);

            scrollDown();
            Thread.sleep(1500);

            clickTo(By.id("moreContentButton"));
            Thread.sleep(1500);
            logger.info("Dafa fazla ürün gösterildi.");

            scrollDownOne();
            Thread.sleep(1500);

            randomSelect(By.xpath("//div[@class='m-productCard__photo']//a"));
            logger.info("Ürün seçildi");
            Thread.sleep(1500);
    }
}