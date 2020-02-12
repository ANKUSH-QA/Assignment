package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;

public class SignInPage extends Base {

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email_create")
	WebElement emailAddressInput;

	@FindBy(id = "SubmitCreate")
	WebElement createAnAccountBtn;

	public boolean accountCreation(String emailInput) {

		wait.until(ExpectedConditions.elementToBeClickable(emailAddressInput));
		if (emailAddressInput.isDisplayed() && emailAddressInput.isEnabled()) {
			emailAddressInput.clear();
			emailAddressInput.sendKeys(emailInput);
			createAnAccountBtn.click();
			
			return true;
		}
		return false;
	}

}
