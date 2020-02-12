package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class LogoutPage extends Base {
	
	public LogoutPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	WebElement orderHistoryBtn;

}
