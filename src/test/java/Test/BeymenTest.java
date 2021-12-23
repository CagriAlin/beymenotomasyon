package Test;

import Main.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BeymenTest extends BaseTest {    // Test İçin Baz Alınacak  Classlar

    HomePage homePage;
    SearchBox searchBox;
    ProductsPage productsPage;
    ProductDetails productDetails;
    BasketPage basketPage;
    ProductDeletion productDeletion;

    @Test
    @Deprecated

    public void BeymenTestApp() throws InterruptedException {  //Test Aşamaları


        homePage = new HomePage(driver);
        homePage.homePageMethod();
        searchBox = new SearchBox(driver);
        searchBox.searchBoxMethod();
        productsPage = new ProductsPage(driver);
        productsPage.productsPage();
        productDetails = new ProductDetails(driver);
        productDetails.productDetails();
        basketPage = new BasketPage(driver);
        basketPage.basketPageMethod();
        productDeletion = new ProductDeletion(driver);
        productDeletion.deletionPage();

    }
}