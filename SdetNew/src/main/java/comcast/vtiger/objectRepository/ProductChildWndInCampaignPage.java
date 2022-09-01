package comcast.vtiger.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductChildWndInCampaignPage {
	
	//Intialization
			public ProductChildWndInCampaignPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		   //Declaration
			@FindBy(name="search_text")
			private WebElement ProductNameInSearchFieldChildWnd;
			
			@FindBy(name="search")
			private WebElement ProductChildWndSerchBtnClick;

			public WebElement getProductNameInSearchFieldChildWnd() {
				return ProductNameInSearchFieldChildWnd;
			}

			public WebElement getProductChildWndSerchBtnClick() {
				return ProductChildWndSerchBtnClick;
			}
			
			//business Logics
			/**
			 * this method is used for selecting product name in childwindow in create campaign page
			 * @param 
			 * @author Bhargavi
			 */
			
			public void SearchFieldProductName(String productName)
			{
				ProductNameInSearchFieldChildWnd.sendKeys(productName);
				
			}
			
			public void SearchButtonClick(WebDriver driver, String productName)
			{
				ProductChildWndSerchBtnClick.click();
				 driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
			}

}
