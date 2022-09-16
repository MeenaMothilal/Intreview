package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HTML_Studio_Page {
public WebDriver driver;

    public WebElement getLine() {
        return line;
    }

    public WebElement getRectangle() {
        return rectangle;
    }

    public WebElement getEraser() {
        return eraser;
    }

    public HTML_Studio_Page(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@class='button line']")
private WebElement line;

@FindBy(xpath = "//input[@class='button rectangle']")
    private WebElement rectangle;
@FindBy(xpath = "//input[@class='button eraser']")
    private WebElement eraser;
}
