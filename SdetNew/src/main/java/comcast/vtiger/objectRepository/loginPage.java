package comcast.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	//Intialization
			public loginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Declaration
			@FindBy(name="user_name")
			private WebElement UserNameTextField;
			
			@FindBy(name="user_password")
			private WebElement UserPasswordTextField;
			
			@FindBy(id="submitButton")
			private WebElement SubmittButton;

			//getter methods
			public WebElement getUserNameTextField() {
	      return UserNameTextField;
			}

			public WebElement getUserPasswordTextField() {
				return UserPasswordTextField;
			}

			public WebElement getSubmittButton() {
			return SubmittButton;
			}
			
			//Business logic
			/**
			 * this method is used for login to applicaion
			 * @param username
			 * @param password
			 * @author Bhargavi
			 */
		   
			public void login(String username, String password)
			{
				UserNameTextField.sendKeys(username);
				UserPasswordTextField.sendKeys(password);
				SubmittButton.click();
			}
			
}
