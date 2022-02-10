package pl_kfd_sklep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//a[@href='#']//span[contains(text(),'KATEGORIE')]")
    private WebElement productCategorySpan;

    @FindBy(xpath = "//a[@href='https://sklep.kfd.pl/kreatyna-c-48.html']")
    private WebElement kreatynaCategoryLink;

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openKreatynaCategory(){
        Actions action = new Actions(driver);
        action.moveToElement(productCategorySpan).perform();
        kreatynaCategoryLink.click();
    }
}
