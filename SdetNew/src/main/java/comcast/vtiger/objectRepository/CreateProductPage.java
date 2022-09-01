package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	
	 //Intialization
		public CreateProductPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		

		//Declaration
		@FindBy(name="productname")
		private WebElement CreateProductNameField;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement CreateProductSaveBtn;
		
		@FindBy(name="Delete")
		private WebElement ProductDeleteBtn;

		//getters method
		public WebElement getCreateProductNameField() {
			return CreateProductNameField;
		}

		public WebElement getCreateProductSaveBtn() {
			return CreateProductSaveBtn;
		}
		
		public WebElement getProductDeleteBtn() {
			return ProductDeleteBtn;
		}

				//business Logics
				/**
				 * this method is used to create new create Product page
				 * @param productNamefield
				 * @param productSaveBtn
				 * @author Bhargavi
				 */
		public void productNameField(String productName)
		{
			CreateProductNameField.sendKeys(productName);
			
		}
		
		public void productSaveBtn()
		
		{
			CreateProductSaveBtn.click();
		}
		
		public void productDelete()
		{
			ProductDeleteBtn.click();
		}

	
}
