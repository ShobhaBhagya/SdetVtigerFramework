package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	//Intialization
			public ProductPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		 //Declaration
			@FindBy(xpath="//img[@alt='Create Product...']")
			private WebElement CreateProductPlusBtn;

			//getters method
			public WebElement getCreateProductPlusBtn() {
				return CreateProductPlusBtn;
			}
			
			//business Logics
			/**
			 * this method is used to create new create organization page
			 * @param organization
			 * @author Bhargavi
			 */
			
			public void ProductPagePlusBtn()
			{
				CreateProductPlusBtn.click();
			}
}
