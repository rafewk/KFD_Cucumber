package pl_kfd_sklep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KreatynaCategoryPage {

    @FindBy(xpath = "//h2[@class='h3 product-title']")
    List<WebElement> productsList;

    private WebDriver driver;

    public KreatynaCategoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openProductDetailsPage(int productIndex){
        productsList.get(productIndex).click();
    }
}
