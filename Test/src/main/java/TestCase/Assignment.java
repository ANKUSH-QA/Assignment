package TestCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.MyStorePage;
import Pages.OrderProcessPage;
import Pages.SignInPage;
import Pages.SignUpPage;

public class Assignment extends Base {

	HomePage homePageObj;
	SignInPage signInPageObj;
	SignUpPage signUpPageObj;
	MyStorePage myStorePageObj;
	MyAccountPage myAccountPageObj;
	OrderProcessPage orderProcessPageObj;

	@BeforeTest
	public void setup() throws InterruptedException {
		initialization("chrome", "http://automationpractice.com/index.php");

		homePageObj = new HomePage();
		signUpPageObj = new SignUpPage();
		myStorePageObj = new MyStorePage();
		signInPageObj = new SignInPage();
		myAccountPageObj = new MyAccountPage();
		orderProcessPageObj = new OrderProcessPage();
	}

	@Test
	public void Test() throws InterruptedException {

		homePageObj.clickOnSignInBtn();

		signInPageObj.accountCreation("ankush5@mailinator.com");

		signUpPageObj.fillDetailsOfCreateAccount();

		myAccountPageObj.clickOnWomenSection();

		myStorePageObj.selectProduct();
		myStorePageObj.addQuantity();
		myStorePageObj.clickOnAddToCart();
		myStorePageObj.clickOnProceedToCheckoutBtn();

		orderProcessPageObj.getTotalPriceOfProduct();

		orderProcessPageObj.summaryCheckout();
		orderProcessPageObj.addressCheckout();
		orderProcessPageObj.shippingCheckout();
		orderProcessPageObj.paymentCheckout();

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		// Thread.sleep(10000);
		driver.quit();
	}

}
