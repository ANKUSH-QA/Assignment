package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Base;

public class MyStorePage extends Base {

	public MyStorePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ul[@class='product_list grid row']")
	WebElement productImageContainer;

	@FindBy(xpath = "//div[@class='product-image-container']")
	WebElement products;

	@FindBy(xpath = "//span[text()='Quick view']")
	WebElement quickViewBtn;

	@FindBy(id = "quantity_wanted")
	WebElement quantityInput;

	@FindBy(xpath = "//i[@class='icon-plus']")
	WebElement plusQuantityBtn;

	@FindBy(xpath = "//i[@class='icon-minus']")
	WebElement minusQuantityBtn;

	@FindBy(xpath = "//button[@type='submit' and @name='Submit']")
	WebElement addToCartBtn;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	WebElement proceedToCheckoutBtn;

	public void selectProduct() {

		wait.until(ExpectedConditions.visibilityOf(products));

		List<WebElement> productAllValues = productImageContainer
				.findElements(By.xpath(".//div[@class='product-image-container']"));
		productAllValues.get(0).click();
		pageLoadWait();

		System.out.println("Product Selected");
	}

	public void addQuantity() throws InterruptedException {
		Thread.sleep(5000);
	try {
		//	plusQuantityBtn.click();
		quantityInput.clear();
		quantityInput.sendKeys("2");
		pageLoadWait();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Quantity Element not working");
	}
	}

	public boolean clickOnAddToCart() throws InterruptedException {
		Thread.sleep(3000);
		if(addToCartBtn.isDisplayed()) {
		addToCartBtn.click();
		pageLoadWait();
		return true;
		}return false;
	}
	
	public void clickOnProceedToCheckoutBtn() {
		proceedToCheckoutBtn.click();
		pageLoadWait();
	}
	
	

}
