package com.crm.sdet.campaigns;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comcast.vtiger.genericUtility.BaseClass;
import comcast.vtiger.genericUtility.Excel_Utility;
import comcast.vtiger.genericUtility.Java_Utility;
import comcast.vtiger.genericUtility.WebDriver_Utility;
import comcast.vtiger.objectRepository.CampaignPage;
import comcast.vtiger.objectRepository.CampaignValidation;
import comcast.vtiger.objectRepository.CreateCampaignPage;
import comcast.vtiger.objectRepository.CreateProductPage;
import comcast.vtiger.objectRepository.ProductChildWndInCampaignPage;
import comcast.vtiger.objectRepository.ProductPage;
import comcast.vtiger.objectRepository.homePage;
@Listeners(comcast.vtiger.genericUtility.ListenerImplementationClass.class)
public class CampaignwithProductnameTest extends BaseClass {
	
	@Test(groups= {"regressionTest"})
	public void CampaignwithProductname() throws Throwable {
	
        Java_Utility jlib= new Java_Utility(); 
        Excel_Utility elib=new Excel_Utility();
        
        WebDriver_Utility wlib= new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		
		//creating product
		homePage homepage = new homePage(driver);
		homepage.clickproductsModule();
		
		ProductPage productpage= new ProductPage(driver);
		productpage.ProductPagePlusBtn();
	
		//random number for product name
		int ranNum = jlib.getRandomNum();
		String productName = elib.getDataFromExcel("products", 1, 0)+ranNum;
		System.out.println(productName);
		
		//entering product name into product field and saving 
		CreateProductPage createProduct = new CreateProductPage(driver);
		createProduct.productNameField(productName);
		createProduct.productSaveBtn();
		
        //select campaign with more option
		homepage.clickmoreModule();
		homepage.clickcampaignModule();

		CampaignPage campaignpage= new CampaignPage(driver);
		campaignpage.CampaignPagePlusBtn();
	
		//random number for campaign name
		int ranNum2 = jlib.getRandomNum();
		String campaignName = elib.getDataFromExcel("campaigns", 1, 0)+ranNum2;
        System.out.println(campaignName);
        
      //entering cmpaign name into campaign field
        CreateCampaignPage createcampaign = new CreateCampaignPage(driver);
        createcampaign.CampaignNameField(campaignName);
        
        //In create campaign page select product name in child window
        createcampaign.CreateCampaignProductPlusBtn();
        
        //switching to child window
        wlib.switchToWindow(driver, "Products&action");       
        
        ProductChildWndInCampaignPage searchproduct =new ProductChildWndInCampaignPage(driver);
        searchproduct.SearchFieldProductName(productName);
        searchproduct.SearchButtonClick(driver, productName);
        //driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
        
        //switch back to parent window
        wlib.switchToWindow(driver, "Campaigns&action");
        
        //save the create campaign page
        createcampaign.CampaignSaveBtn();
        
      //get the header text of create campaign
        CampaignValidation actualCampaignName = new CampaignValidation(driver);
        String actualCampaigndata= actualCampaignName.actualCampaignName();
        Assert.assertEquals(actualCampaigndata.contains(campaignName), true);
        
//        String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
//        if(actData.contains(campaignName))
//        {
//        	System.out.println("pass");
//        }
//        else
//        {
//        	System.out.println("fail");
//        }
        
        //sign out   
	      homepage.mouseoverOnAdminstrator(driver);
	      homepage.clicksignoutBtn();
	        
		  driver.close();
		  
	}

}
