package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
		//step 1: get the java representation object of the physical file(java.uti.package)
				FileInputStream fis=new FileInputStream("./data/Commondata.properties");
				
				//step 2:create an object to property class to load all the keys(java io package)
				Properties pboj= new Properties();
				
				//step3 : load the keys
				pboj.load(fis);
				
			     //step4 :read the value using getproperty("key")
				String Browser=pboj.getProperty("browser");
				String Url=pboj.getProperty("url");
				String Username=pboj.getProperty("un");
				String Password=pboj.getProperty("pw");
				
				//step5: execute the statements
				WebDriver driver=new ChromeDriver();
				driver.get(Url);
				driver.findElement(By.name("user_name")).sendKeys(Username);
				driver.findElement(By.name("user_password")).sendKeys(Password);
				driver.findElement(By.id("submitButton")).click();

	}

}
