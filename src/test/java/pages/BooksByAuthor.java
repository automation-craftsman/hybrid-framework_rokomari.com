package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Commons;
import support.Utilities;

public class BooksByAuthor extends Base {

    By booksPageAd = By.xpath("//img[@alt='close']");
    By sortBestSellerRadio = By.xpath("//label[normalize-space()='Best Seller']");
    By inStockCheckBox = By.xpath("//label[normalize-space()='In Stock']");
    By filterChirayotoUponnash = By.xpath("//label[contains(text(),'চিরায়ত উপন্যাস')]");
    By publisherBisshawShahittoKendro = By.xpath("//label[contains(text(),'বিশ্বসাহিত্য কেন্দ্র')]");
    By shesherKobiatBookDetailsBtn = By.xpath("//div[@title='শেষের কবিতা রবীন্দ্রনাথ ঠাকুর']//a[normalize-space()='View Details']");

    By bookTitle = By.xpath("//body/div[@class='browse-page']/div[@class='container-fluid custom-container px-0']/div[@class='d-flex justify-content-start align-items-start']/div[@class='main-browse-content']/section[@class='browse__content']/div[@class='browse__content-books-wrapper']/div[@class='row']/div[1]/div[1]/a[1]");
    By addToCartButton = By.xpath("//body[1]/div[6]/div[1]/div[1]/div[1]/section[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/button[1]");

    Utilities utils = new Utilities();
    Commons common = new Commons();

    /**
     * Will filter books by different criteria
     */
    public void filterBooks(){
        common.closeAd(booksPageAd);

        utils.getWebElement(sortBestSellerRadio).click();
        utils.getWebElement(inStockCheckBox).click();

        utils.scrollToElement(filterChirayotoUponnash);
        utils.getWebElement(filterChirayotoUponnash).click();

        utils.scrollToElement(publisherBisshawShahittoKendro);
        utils.getWebElement(publisherBisshawShahittoKendro).click();

    }

    /**
     * Will view the details of the selected book and
     * @return an object of BookDetails page
     */
    public BookDetails viewDetails(){
        common.viewBookDetails(shesherKobiatBookDetailsBtn);

        return new BookDetails();
    }

}
