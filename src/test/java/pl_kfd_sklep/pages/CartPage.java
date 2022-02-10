package pl_kfd_sklep.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {

    @FindBy(xpath = "//i[text()='delete']")
    private WebElement deleteProductTrashCan;

    @FindBy(name = "product-quantity-spin")
    private WebElement productQuantityInput;

    @FindBy(xpath = "//div[@id='cart-subtotal-products']//span[@class='label js-subtotal']")
    private WebElement currentTotalQuantity;


    private final WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void deleteProductFromCart(){
        deleteProductTrashCan.click();
    }

    public void setProductQuantity(String quantity){
        productQuantityInput.clear();
        productQuantityInput.sendKeys(quantity);
        productQuantityInput.sendKeys(Keys.ENTER);
    }

    public WebElement getCurrentTotalQuantity(){
        return currentTotalQuantity;
    }
}
