package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class OrderProcessPage extends Base {
	public OrderProcessPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "total_price")
	WebElement totalPriceVisible;

	@FindBy(id = "//a[contains(@class,'button btn btn-default')]")
	WebElement proceedToCheckoutBtn_Summary;

	@FindBy(xpath = "//button[@name='processAddress']")
	WebElement proceedToCheckoutBtn_Address;

	@FindBy(id = "cgv")
	WebElement iAgreeCheckbox;

	@FindBy(xpath = "//button[contains(@class,'button btn btn-default')]")
	WebElement proceedToCheckoutBtn_Shipping;

	@FindBy(xpath = "//button[contains(@class,'button btn btn-default')]")
	WebElement proceedToCheckoutBtn_Payment;

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	WebElement payByBankWireBtn;

	@FindBy(xpath = "//a[@title='Pay by check.']")
	WebElement payByCheckBtn;

	@FindBy(xpath = "//button[contains(@class,'button btn btn-default')]")
	WebElement iConfirmMyOrder;

	@FindBy(xpath = "//a[contains(text(),'Back to orders')]")
	WebElement backToOrderBtn;

	@FindBy(xpath = "//p[@class='alert alert-success']")
	WebElement orderAlert;

	public void getTotalPriceOfProduct() {
		System.out.println( totalPriceVisible.getText());
	
	}

	public void summaryCheckout() {
		proceedToCheckoutBtn_Summary.click();
		pageLoadWait();

	}

	public void signinCheckout() {
		//skipped
	}

	public void addressCheckout() {
		proceedToCheckoutBtn_Address.click();
		pageLoadWait();
	}

	public void shippingCheckout() {
		iAgreeCheckbox.click();
		proceedToCheckoutBtn_Shipping.click();
		pageLoadWait();
	}

	public void paymentCheckout() {

		payByCheckBtn.click();
		pageLoadWait();
		iConfirmMyOrder.click();
		System.out.println(orderAlert.getText());

		backToOrderBtn.click();
		pageLoadWait();

	}


}
