package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;

public class MyAccountPage extends Base {
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Women']")
	WebElement womenBtn;

	public void clickOnWomenSection() {

		wait.until(ExpectedConditions.elementToBeClickable(womenBtn));
		womenBtn.click();
	}

}
