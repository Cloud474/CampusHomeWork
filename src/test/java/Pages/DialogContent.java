package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(id="mat-input-0")
    private WebElement userName;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement menu;

    @FindBy(xpath="//span[text()=' Merhaba, Hüseyin Bulut ! ']")
    private WebElement success;

    @FindBy(xpath = "//span[text()='Oturumu Kapat']")
    private WebElement logOut;

    @FindBy(xpath = "//*[text()='Invalid username or password']")
    private WebElement errorMessage;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "userName": myElement = userName;break;
            case "password": myElement = password;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "login": myElement = loginBtn;break;
            case "menu": myElement = menu;break;
            case "logout": myElement = logOut;break;
            case "acceptCookies": myElement = acceptCookies;break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "success" : myElement =success; break;
            case "error" : myElement =errorMessage; break;

        }
        verifyContainsText(myElement, text);
    }
}

