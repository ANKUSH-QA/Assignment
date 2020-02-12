package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class ProfilePage extends Base {
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@title,'View my customer account')]")
	WebElement profileBtn;

	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	WebElement orderHistoryBtn;

	@FindBy(xpath = "//td[@class='history_price']")
	WebElement historyPriceLabel;

	@FindBy(xpath = "//span[text()=' Home']")
	WebElement backToHomeBtn;

	@FindBy(xpath = "//a[@title='Log me out']")
	WebElement logoutBtn;

	public void clickOnProfileBtn() {
		profileBtn.click();
		pageLoadWait();
	}

	public void clickOnOrderhistoryBtn() {
		orderHistoryBtn.click();
		pageLoadWait();
	}

	public void getPriceOfOrderFromOrderHistory() {
		String OrderPrice = historyPriceLabel.getText();
		System.out.println(OrderPrice);
	}

}
