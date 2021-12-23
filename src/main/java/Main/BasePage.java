package Main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;



public class BasePage {
    WebDriver driver;

    @Deprecated

    public BasePage(WebDriver driver){

        this.driver = driver;

    }
    public WebElement findTo(By locator){return driver.findElement(locator);}  //Elementi Bulmaya Yarayan Fonsiyon

    public void clickTo(By locator){
        findTo(locator).click();
    } //Bulunan Elemente Tıklama Fonsiyonu


    public void sendKeys(By locator , String text){       //Klavyeden Girdi Fonksiyonu
        findTo(locator).sendKeys(text);
    }

    public void scrollDown(){                             //Sayfa Sonuna gitme Fonsiyonu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }
    public void scrollDownOne(){                          //Belirli bir değerde sayfa kaydırma fonsiyonu
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
    }
    public List<WebElement> findToAll(By locator){  //Elementler Fonsiyonu

        return driver.findElements(locator);
    }

    public void randomSelect(By locator){       //Rastgele Seçim Yapmaya Yarayan Fonsiyon
        Random rand = new Random();
        findToAll(locator).get(rand.nextInt(findToAll(locator).size())).click();
    }
    public void assertCont(String url){   //Url Doğrulama FonKsiyonu

        Assert.assertEquals(url , driver.getCurrentUrl());
    }

    public String priceOne(By locator){  //Seçilen Elementin String Türünde Tanımlanması Fonksiyonu

        return driver.findElement(locator).getText();
    }

    public String priceTwo(By locator){      //Seçilen Elementin String Türünde Tanımlanması Fonksiyonu

        return driver.findElement(locator).getText();
    }

    public String textOne(By locator){       //Seçilen Elementin String Türünde Tanımlanması Fonksiyonu

        return driver.findElement(locator).getText();
    }

    public String textTwo(By locator){      //Seçilen Elementin String Türünde Tanımlanması Fonksiyonu

        return driver.findElement(locator).getText();
    }

    public String textThree(By locator){    //Seçilen Elementin String Türünde Tanımlanması Fonksiyonu

        return driver.findElement(locator).getText();
    }

    public String textFour(By locator){     //Seçilen Elementin String Türünde Tanımlanması Fonksiyonu

        return driver.findElement(locator).getText();
    }

    public void assertPrice(String text , String text2){  //Element Karşılaştırma Fonksiyonu
        Assert.assertEquals(text , text2);
    }

    public void assertComp(String text , String text2){  //Element Karşılaştırma Fonksiyonu
        Assert.assertEquals(text , text2);
    }

}