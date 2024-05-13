package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver ldriver;
        public LoginPage(WebDriver rdriver)
        {
        	ldriver=rdriver;
        	PageFactory.initElements(rdriver,this);
        
        }
        @FindBy(name="user-name")
        WebElement CustUserName;
        @FindBy(id="password")
        WebElement CustPassword
        @FindBy(id="login-button")
        WebElement LoginButton;
        
        public void setCustUserName(String uname)
        {
        	CustUserName.sendKeys(uname);
        }
        public void setCustPassword(String upassword)
        {
        	CustPassword.sendKeys(upassword);
        	
        }
        public void setLoginButton()
        {
        	LoginButton.click();
        }
	}

}
