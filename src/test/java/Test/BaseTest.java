package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    WebDriver driver;

    @BeforeAll

    public void setUp() {       //Testin Başlaması
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.beymen.com/"); //İşlem Yapılacak Site
        driver.manage().window().maximize();   //Tarayıcının Tam Ekran Yapılması
    }

    @AfterAll
    public void tearDown() {    //Testin Bitirilmesi
        driver.quit();


    }
}
