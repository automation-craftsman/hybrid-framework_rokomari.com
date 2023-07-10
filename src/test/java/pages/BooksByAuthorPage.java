package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import support.Commons;
import support.Utilities;

public class BooksByAuthorPage extends Base {

    private By booksPageAd = By.xpath("//img[@alt='close']");
    private By sortBestSellerRadio = By.xpath("//label[normalize-space()='Best Seller']");
    private By inStockCheckBox = By.xpath("//label[normalize-space()='In Stock']");
    private By filterChirayotoUponnash = By.xpath("//label[contains(text(),'চিরায়ত উপন্যাস')]");

    private By shesherKobiataBook = By.xpath("//img[@alt='Sheser kobita image']");
    private By shesherKobiatCartBtn = By.xpath("(//button[@class='btn cart-btn js--add-to-cart'][normalize-space()='Add to Cart'])[1]");
    private By scrollPointJogajogBook = By.xpath("(//img[@alt='Jogajog image'])[1]");
    private By chokherBaliBook = By.xpath("(//img[@alt='Chokher Bali image'])[1]");
    private By chokherBaliCartBtn = By.xpath("(//button[@class='btn cart-btn js--add-to-cart'][normalize-space()='Add to Cart'])[10]");
    private By cartBtn = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");

    Utilities utils = new Utilities();
    Commons common = new Commons();

    Actions actions;

    /**
     * Will filter books by different criteria
     */
    public void filterBooks(){
        common.closeAd(booksPageAd);

        System.out.println("[-] BooksByAuthorPage : Sorting by 'Best Seller' books...");
        utils.getWebElement(sortBestSellerRadio).click();
        System.out.println("[-] BooksByAuthorPage : Filtering by 'In Stock' books...");
        utils.getWebElement(inStockCheckBox).click();
        System.out.println("[-] BooksByAuthorPage : Filtering by 'Chirayoto Uponnash' category...");
        utils.getWebElement(filterChirayotoUponnash).click();

    }

    /**
     * Will view the details of the selected book and
     * @return an object of BookDetails page
     */
    public void addBooksToCart(){

        System.out.println("[-] BooksByAuthorPage : Adding books to the cart...");
        // Adding shesher kobiata book to the cart
        utils.hoverOverElement(shesherKobiataBook);
        utils.getWebElement(shesherKobiatCartBtn).click();

        // Adding chokher bali book to the cart
        utils.scrollToElement(scrollPointJogajogBook);
//        utils.hoverOverElement(chokherBaliBook);
//        utils.getWebElement(chokherBaliCartBtn).click();
    }

    public CartPage goToCart(){

        System.out.println("[-] BookDetailsPage : Going to the CartPage...");
        utils.getWebElement(cartBtn).click();

        return new CartPage();
    }

}
