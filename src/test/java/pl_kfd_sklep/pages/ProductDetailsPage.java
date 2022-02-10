package pl_kfd_sklep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

    //"//div[@class='add']//button[text()=' Dodaj do koszyka ']"
    @FindBy(xpath = "//div[@class='add']//button[contains(text(),'Dodaj')]")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//h4[@id='myModalLabel']")
    private WebElement productAddedModalHeader;

    @FindBy(xpath = "//a[contains(text(),'Idź')]")
    private WebElement openCartModalLink;

    private final WebDriver driver;

    public ProductDetailsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void addToCart(){
        addToCartBtn.click();
    }

    public void openCart(){
        openCartModalLink.click();
    }

    public WebElement getProductAddedModalHeader(){
        return productAddedModalHeader;
    }
}
