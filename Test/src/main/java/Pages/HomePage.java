package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;

public class HomePage extends Base {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	WebElement signInBtn;

	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement contactUsBtn;

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cartBtn;

	public void clickOnSignInBtn() {
		
		wait.until(ExpectedConditions.elementToBeClickable(signInBtn));

		if (signInBtn.isDisplayed() && signInBtn.isEnabled()) {
			signInBtn.click();
			
		}
	

	}

}
