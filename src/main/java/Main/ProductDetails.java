package Main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetails extends BasePage{

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    @Deprecated

    public ProductDetails(WebDriver driver) {

        super(driver);
    }

    public void productDetails() throws InterruptedException { //Ürün Seçimi Yapma Test Senaryosu

        randomSelect(By.xpath("//span[@class='m-variation__item']"));
        logger.info("Beden Seçildi.");
        Thread.sleep(1500);

        clickTo(By.id("addBasket"));
        logger.info("Sepete eklendi");
        Thread.sleep(1500);

        String productPrice = priceTwo(By.cssSelector("ins[class='m-price__new']"));

        clickTo(By.xpath("//a[@href='/cart']"));
        logger.info("Sepetim Açıldı.");
        Thread.sleep(1500);

        String basketPrice = priceOne(By.cssSelector("span[class='m-productPrice__salePrice']"));
        assertPrice(productPrice,basketPrice);

    }

}