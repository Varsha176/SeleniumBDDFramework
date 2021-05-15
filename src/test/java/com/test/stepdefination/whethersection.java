package com.test.stepdefination;
import org.testng.Assert;

import com.test.base.ConfigHelper;
import com.test.base.Webdriverfactory;
import com.test.base.base;
import com.test.pageobjects.WhetherPageObject;
import com.test.utility.Commonfunctions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class whethersection extends base{
	
	WhetherPageObject whether =new WhetherPageObject(Webdriverfactory.getDriver());
	Commonfunctions common =new Commonfunctions(Webdriverfactory.getDriver());

	String url=ConfigHelper.INSTANCE.getProperty("Url");
	
	@Given("Launch Application")
	public void Application_Launch() throws Throwable {

		Webdriverfactory.getDriver().get(url);
	}
	
	@When("User Navigate to whether section")
	public void Navigate_whether_section() throws Throwable {
		common.sleep(10);
		try
		{
			if(whether.Notification.isDisplayed())
			{
				whether.No_Thanks.click();
			}
			
				
			
			whether.ThreeDotMenu.click();
			whether.WEATHER.click();
			common.UrlToBe("https://social.ndtv.com/static/Weather/report/?pfrom=home-ndtv_topsubnavigation");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			ex.getCause();
		}
			
		
	}
	
	@And("Pin a city")
	public void Pin_a_city() throws Throwable {
		common.waitForElement(whether.PinYourCity);
		
		try
		{
			whether.Check_Ajmer.click();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@And("validate the temprature")
	public void Validatethetemprature() throws Throwable {
		
		
		try
		{
			whether.Click_city.click();	
			WhetherObj1=whether.CityDegreetemp.getText();
			System.out.print("temp in celcius:"+WhetherObj1);
			Assert.assertTrue(whether.Whether_Popup.isDisplayed());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@And("Click on any Other City")
	public void Click_Any_Other_City() throws Throwable {
		
		
		try
		{
			whether.Click_Patna.click();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	@And("Save the whether details")
	public void Save_whether_details() throws Throwable {
		
		
		try
		{
			WhetherObj2=whether.CityTwoDegreetemp.getText();
			System.out.print("temp in celcius:"+WhetherObj2);
			common.sleep(2);
			Assert.assertTrue(whether.Whether_Popup.isDisplayed());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
