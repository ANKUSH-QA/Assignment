package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Base.Base;

public class SignUpPage extends Base {

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement maleGenderBtn;

	@FindBy(id = "id_gender2")
	WebElement femaleGendereBtn;

	@FindBy(id = "customer_firstname")
	WebElement firstNameInput;

	@FindBy(id = "customer_lastname")
	WebElement lastNameInput;

	@FindBy(id = "email")
	WebElement emailInput;

	@FindBy(id = "passwd")
	WebElement passwordInput;

	@FindBy(id = "days")
	WebElement daysDropdown;

	@FindBy(id = "months")
	WebElement monthDropdown;

	@FindBy(id = "years")
	WebElement yearDropdown;

	@FindBy(id = "newsletter")
	WebElement newsLetterCheckbox;

	@FindBy(id = "optin")
	WebElement speacialOfferCheckbox;

	@FindBy(id = "firstname")
	WebElement firstNameInput_YA;

	@FindBy(id = "lastname")
	WebElement lastNameInput_YA;

	@FindBy(id = "company")
	WebElement comapny_YA;

	@FindBy(id = "address1")
	WebElement Address_YA;

	@FindBy(id = "address2")
	WebElement Address2_YA;

	@FindBy(id = "city")
	WebElement cityInput;

	@FindBy(id = "id_state")
	WebElement stateDropdown;

	@FindBy(id = "postcode")
	WebElement zipcodeInput;

	@FindBy(id = "id_country")
	WebElement countryDropdown;

	@FindBy(id = "other")
	WebElement additionInfoInput;

	@FindBy(id = "phone")
	WebElement homePhoneInput;

	@FindBy(id = "phone_mobile")
	WebElement mobilePhoneInput;

	@FindBy(id = "alias")
	WebElement emailReferenceInput;

	@FindBy(id = "submitAccount")
	WebElement registerBtn;

	public void fillDetailsOfCreateAccount() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(firstNameInput));
		
		maleGenderBtn.click();
		
		firstNameInput.clear();
		firstNameInput.sendKeys("Ankush");
		
		lastNameInput.sendKeys("Singhal");
		
		emailInput.clear();
		emailInput.sendKeys("ankush1@mailinator.com");
		
		passwordInput.sendKeys("test@123");
		
		new Select(daysDropdown).selectByValue("5");
		new Select(monthDropdown).selectByValue("12");
		new Select(yearDropdown).selectByValue("2000");

		newsLetterCheckbox.click();
		speacialOfferCheckbox.click();

		firstNameInput_YA.sendKeys("Ankush");
		lastNameInput_YA.sendKeys("Singhal");
		comapny_YA.sendKeys("Choice Tech Lab");
		Address_YA.sendKeys("Marol");
		Address2_YA.sendKeys("Andheri");

		cityInput.sendKeys("Mumbai");

		new Select(stateDropdown).selectByValue("32");

		zipcodeInput.sendKeys("12345");

		new Select(countryDropdown).selectByValue("21");

		additionInfoInput.sendKeys("I am Automation Tester");

		homePhoneInput.sendKeys("9300374406");

		mobilePhoneInput.sendKeys("9300374406");
		
		emailReferenceInput.clear();
		emailReferenceInput.sendKeys("ankushsinghal988@gmail.com");
		
		Thread.sleep(5000);

		registerBtn.click();
		
		System.out.println("Registration Successful");

	}

}
